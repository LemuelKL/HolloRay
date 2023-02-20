import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.scene.Scene;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

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

    static int SCREEN_WIDTH = 800;
    static int SCREEN_HEIGHT = 600;

    static Group root;
    static Stage stage;
    static Scene scene;
    static Translate pivot;
    static Camera camera;
    static Rotate cameraRotateX;
    static Rotate cameraRotateY;
    static Rotate cameraRotateZ;

    @Override
    public String name() {
        return "HolloRay's JavaFX Plugin";
    }

    void Shout(String msg) {
        System.out.println(ANSI_PURPLE + "[PLUGIN] " + ANSI_RESET + msg);
    }

    @Override
    public Value user(Value... args) throws ARTException {
        switch (args[0].value().toString()) {
            case "init":
                Shout("Initialising JavaFX stage");
                stage = new Stage();
                root = new Group();
                scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);

                buildCamera();
                buildAxes();

                return new __done();
            case "paint":
                Shout("Painting JavaFX stage");
                stage.setScene(scene);
                stage.setTitle("HolloRay");
                stage.show();

                scene.setOnKeyPressed(event -> {
                    switch (event.getCode()) {
                        case Z:
                            camera.setTranslateZ(camera.getTranslateZ() + 10);
                            break;
                        case X:
                            camera.setTranslateZ(camera.getTranslateZ() - 10);
                            break;
                        case UP:
                            camera.setTranslateY(camera.getTranslateY() - 10);
                            break;
                        case DOWN:
                            camera.setTranslateY(camera.getTranslateY() + 10);
                            break;
                        case LEFT:
                            camera.setTranslateX(camera.getTranslateX() - 10);
                            break;
                        case RIGHT:
                            camera.setTranslateX(camera.getTranslateX() + 10);
                            break;
                        case W:
                            cameraRotateX.setAngle(cameraRotateX.getAngle() - 10);
                            break;
                        case S:
                            cameraRotateX.setAngle(cameraRotateX.getAngle() + 10);
                            break;
                        case A:
                            cameraRotateY.setAngle(cameraRotateY.getAngle() - 10);
                            break;
                        case D:
                            cameraRotateY.setAngle(cameraRotateY.getAngle() + 10);
                            break;
                        case Q:
                            cameraRotateZ.setAngle(cameraRotateZ.getAngle() - 10);
                            break;
                        case E:
                            cameraRotateZ.setAngle(cameraRotateZ.getAngle() + 10);
                            break;
                        default:
                            break;
                    }
                });

                return new __done();
            case "cube":
                spawnCube((double) args[1].value());
                return new __done();
            case "cylinder":
                spawnCylinder((double) args[1].value(), (double) args[2].value());
                return new __done();
            case "sphere":
                spawnSphere((double) args[1].value());
                return new __done();
            default:
                Shout("Unknown internal command: " + args[0]);
                return new __string("OH NO!");
        }
    }

    private void buildCamera() {
        camera = new PerspectiveCamera(true);
        pivot = new Translate(0, 0, 0);
        cameraRotateX = new Rotate(0, Rotate.X_AXIS);
        cameraRotateY = new Rotate(0, Rotate.Y_AXIS);
        cameraRotateZ = new Rotate(0, Rotate.Z_AXIS);
        camera.getTransforms().addAll(
                pivot,
                cameraRotateX,
                cameraRotateY,
                cameraRotateZ,
                new Translate(0, 0, -1000));

        camera.setNearClip(1);
        camera.setFarClip(10000);
        scene.setCamera(camera);
    }

    private void spawnCube(double side_length) {
        Shout("Spawning a box with side length " + side_length);
        Box box = new Box();
        box.setMaterial(new PhongMaterial(Color.BLUE));
        box.setDepth(side_length);
        box.setHeight(side_length);
        box.setWidth(side_length);
        root.getChildren().add(box);
    }

    private void spawnCylinder(double radius, double height) {
        Shout("Spawning a cylinder with radius " + radius + " and height " + height);
        Cylinder cylinder = new Cylinder();
        cylinder.setMaterial(new PhongMaterial(Color.RED));
        cylinder.setRadius(radius);
        cylinder.setHeight(height);
        root.getChildren().add(cylinder);
    }

    private void spawnSphere(double radius) {
        Shout("Spawning a sphere with radius " + radius);
        Sphere sphere = new Sphere();
        sphere.setMaterial(new PhongMaterial(Color.GREEN));
        sphere.setRadius(radius);
        root.getChildren().add(sphere);
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
        final Box yAxis = new Box(1, 240.0, 1);
        final Box zAxis = new Box(1, 1, 240.0);

        xAxis.setMaterial(redMaterial);
        yAxis.setMaterial(greenMaterial);
        zAxis.setMaterial(blueMaterial);

        final Group axisGroup = new Group(xAxis, yAxis, zAxis);
        root.getChildren().addAll(axisGroup);
    }
}
