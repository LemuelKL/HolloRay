import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import com.google.common.collect.BiMap;

public class ValueUserPlugin implements ValueUserPluginInterface {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Group root;
    static Stage stage;
    static Scene scene;
    static Rotate sceneRotateX;
    static Rotate sceneRotateY;
    static Rotate sceneRotateZ;
    static Camera camera;

    static int nextSolidId;
    static BiMap<Integer, javafx.scene.shape.Shape3D> solids;

    @Override
    public String name() {
        return "HolloRay's JavaFX Plugin";
    }

    void Shout(String msg) {
        System.out.println(ANSI_PURPLE + "[PLUGIN] " + ANSI_RESET + msg);
    }
    
    void Print(String msg) {
        System.out.print(ANSI_CYAN + msg + ANSI_RESET);
    }
    
    @Override
    public Value user(Value... args) throws ARTException {
        switch (args[0].value().toString()) {
            case "init":
                solids = com.google.common.collect.HashBiMap.create();
                return initialise((int) args[1].value(), (int) args[2].value());
            case "paint":
                return paint();
            case "clear":
                Shout("Clearing the scene");
                root.getChildren().clear();
                return new __done();
            case "print":
                Print(args[1].value().toString());
                return new __done();
            case "printNewLineChar":
                Print("\n");
                return new __done();
            case "translate": {
                int solidId = (int) args[1].value();
                double x = (double) args[2].value();
                double y = (double) args[3].value();
                double z = (double) args[4].value();
                Shout("Translating solid " + solidId + " by " + x + ", " + y + ", " + z);
                solids.get(solidId).setTranslateX(solids.get(solidId).getTranslateX() + x);
                solids.get(solidId).setTranslateY(solids.get(solidId).getTranslateY() + y);
                solids.get(solidId).setTranslateZ(solids.get(solidId).getTranslateZ() + z);
                return new __done();
            }
            case "rotate": {
                int solidId = (int) args[1].value();
                double xAngle = (double) args[2].value();
                double yAngle = (double) args[3].value();
                double zAngle = (double) args[4].value();
                Shout("Rotating solid " + solidId + " by " + xAngle + ", " + yAngle + ", " + zAngle);
                solids.get(solidId).setRotationAxis(Rotate.X_AXIS);
                solids.get(solidId).setRotate(solids.get(solidId).getRotate() + xAngle);
                solids.get(solidId).setRotationAxis(Rotate.Y_AXIS);
                solids.get(solidId).setRotate(solids.get(solidId).getRotate() + yAngle);
                solids.get(solidId).setRotationAxis(Rotate.Z_AXIS);
                solids.get(solidId).setRotate(solids.get(solidId).getRotate() + zAngle);
                return new __done();
            }
            case "scale": {
                int solidId = (int) args[1].value();
                double x = (double) args[2].value();
                double y = (double) args[3].value();
                double z = (double) args[4].value();
                Shout("Scaling solid " + solidId + " by " + x + ", " + y + ", " + z);
                solids.get(solidId).setScaleX(solids.get(solidId).getScaleX() * x);
                solids.get(solidId).setScaleY(solids.get(solidId).getScaleY() * y);
                solids.get(solidId).setScaleZ(solids.get(solidId).getScaleZ() * z);
                return new __done();
            }
            case "box":
                spawnBox((double) args[1].value(), (double) args[2].value(), (double) args[3].value());
                return new __int32(nextSolidId++, 0);
            case "cube":
                spawnCube((double) args[1].value());
                return new __int32(nextSolidId++, 0);
            case "sphere":
                spawnSphere((double) args[1].value());
                return new __int32(nextSolidId++, 0);
            case "cylinder":
                spawnCylinder((double) args[1].value(), (double) args[2].value());
                return new __int32(nextSolidId++, 0);
            case "cone":
                spawnCone((double) args[1].value(), (double) args[2].value());
                return new __done();
            case "torus":
                spawnTorus((double) args[1].value(), (double) args[2].value());
                return new __done();
            case "tetrahedron":
                spawnTetrahedron((double) args[1].value());
                return new __done();
            case "pyramid":
                spawnPyramid((double) args[1].value(), (double) args[2].value());
                return new __done();
            case "int2real": {
                int theInt = (int) args[1].value();
                double theDouble = Double.valueOf(theInt);
                return new __real64(theDouble);
            }
            case "real2int": {
                Double theDouble = Double.valueOf((double) args[1].value());
                int theInt = theDouble.intValue();
                return new __int32(theInt, 0);
            }
            default:
                Shout("Unknown internal command: " + args[0]);
                return new __string("OH NO!");
        }
    }

    private Value paint() {
        Shout("Painting JavaFX stage");
        stage.setScene(scene);
        stage.setTitle("HolloRay");
        stage.show();
        return new __done();
    }

    private Value initialise(int screen_width, int screen_height) {
        Shout("Initialising JavaFX stage");
        root = new Group();
        scene = new Scene(root, screen_width, screen_width, true);
        stage = new Stage();

        buildCamera();
        buildAxes();

        sceneRotateX = new Rotate(0, Rotate.X_AXIS);
        sceneRotateY = new Rotate(0, Rotate.Y_AXIS);
        sceneRotateZ = new Rotate(0, Rotate.Z_AXIS);
        root.getTransforms().addAll(sceneRotateX, sceneRotateY, sceneRotateZ);

        nextSolidId = 0;

        stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            switch (key.getCode()) {
                case W:
                    sceneRotateX.setAngle(sceneRotateX.getAngle() - 2);
                    break;
                case S:
                    sceneRotateX.setAngle(sceneRotateX.getAngle() + 2);
                    break;
                case A:
                    sceneRotateY.setAngle(sceneRotateY.getAngle() - 2);
                    break;
                case D:
                    sceneRotateY.setAngle(sceneRotateY.getAngle() + 2);
                    break;
                case Q:
                    sceneRotateZ.setAngle(sceneRotateZ.getAngle() - 2);
                    break;
                case E:
                    sceneRotateZ.setAngle(sceneRotateZ.getAngle() + 2);
                    break;
                case Z:
                    camera.setTranslateZ(camera.getTranslateZ() + 10);
                    break;
                case X:
                    camera.setTranslateZ(camera.getTranslateZ() - 10);
                    break;
                case UP:
                    root.setTranslateY(root.getTranslateY() + 10);
                    break;
                case DOWN:
                    root.setTranslateY(root.getTranslateY() - 10);
                    break;
                case LEFT:
                    root.setTranslateX(root.getTranslateX() + 10);
                    break;
                case RIGHT:
                    root.setTranslateX(root.getTranslateX() - 10);
                    break;
                case O:
                    root.setTranslateX(0);
                    root.setTranslateY(0);
                    root.setTranslateZ(0);
                    sceneRotateX.setAngle(0);
                    sceneRotateY.setAngle(0);
                    sceneRotateZ.setAngle(0);
                default:
                    break;
            }
        });

        return new __done();
    }

    private void buildCamera() {
        camera = new PerspectiveCamera(true);
        camera.getTransforms().addAll(
                new Translate(0, 0, -500));

        camera.setNearClip(0.1);
        camera.setFarClip(100000);
        scene.setCamera(camera);
    }

    private void buildAxes() {
        final PhongMaterial redMaterial = new PhongMaterial();
        redMaterial.setDiffuseColor(Color.DARKRED);
        redMaterial.setSpecularColor(Color.RED);

        final PhongMaterial greenMaterial = new PhongMaterial();
        greenMaterial.setDiffuseColor(Color.DARKGREEN);
        greenMaterial.setSpecularColor(Color.GREEN);

        final PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.DARKBLUE);
        blueMaterial.setSpecularColor(Color.BLUE);

        final Box xAxis = new Box(240.0, 1, 1);
        final Sphere xSphere = new Sphere(5);
        xSphere.getTransforms().add(new Translate(120.0, 0, 0));

        final Box yAxis = new Box(1, 240.0, 1);
        final Sphere ySphere = new Sphere(5);
        ySphere.getTransforms().add(new Translate(0, 120.0, 0));

        final Box zAxis = new Box(1, 1, 240.0);
        final Sphere zSphere = new Sphere(5);
        zSphere.getTransforms().add(new Translate(0, 0, 120.0));

        xAxis.setMaterial(redMaterial);
        xSphere.setMaterial(redMaterial);

        yAxis.setMaterial(greenMaterial);
        ySphere.setMaterial(greenMaterial);

        zAxis.setMaterial(blueMaterial);
        zSphere.setMaterial(blueMaterial);

        final Sphere origin = new Sphere(5);
        origin.setMaterial(new PhongMaterial(Color.WHITE));

        final Group axisGroup = new Group(xAxis, yAxis, zAxis, xSphere, ySphere, zSphere, origin);
        root.getChildren().addAll(axisGroup);
    }

    private void spawnBox(double width, double height, double depth) {
        Shout("Spawning a box with width " + width + ", height " + height + ", and depth " + depth);
        Box box = new Box();
        box.setMaterial(new PhongMaterial(Color.INDIGO));
        box.setDepth(depth);
        box.setHeight(height);
        box.setWidth(width);
        root.getChildren().add(box);

        solids.put(nextSolidId, box);
    }

    private void spawnCube(double side_length) {
        Shout("Spawning a box with side length " + side_length);
        Box box = new Box();
        box.setMaterial(new PhongMaterial(Color.BLUE));
        box.setDepth(side_length);
        box.setHeight(side_length);
        box.setWidth(side_length);
        root.getChildren().add(box);

        solids.put(nextSolidId, box);
    }

    private void spawnCylinder(double radius, double height) {
        Shout("Spawning a cylinder with radius " + radius + " and height " + height);
        Cylinder cylinder = new Cylinder();
        cylinder.setMaterial(new PhongMaterial(Color.RED));
        cylinder.setRadius(radius);
        cylinder.setHeight(height);
        root.getChildren().add(cylinder);

        solids.put(nextSolidId, cylinder);
    }

    private void spawnSphere(double radius) {
        Shout("Spawning a sphere with radius " + radius);
        Sphere sphere = new Sphere();
        sphere.setMaterial(new PhongMaterial(Color.GREEN));
        sphere.setRadius(radius);
        root.getChildren().add(sphere);

        solids.put(nextSolidId, sphere);
    }

    private void spawnTorus(double radius, double tube_radius) {
        // Shout("Spawning a torus");
        // TODO
    }

    private void spawnCone(double radius, double height) {
        // Shout("Spawning a cone");
        // TODO
    }

    private void spawnPyramid(double side_length, double height) {
        // Shout("Spawning a pyramid");
        // TODO
    }

    private void spawnTetrahedron(double side_length) {
        // Shout("Spawning a tetrahedron");
        // TODO
    }

}
