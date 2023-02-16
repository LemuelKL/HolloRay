import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;

import javafx.scene.Group;
import javafx.scene.Scene;
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
        return new __done();
      case "paint":
        Shout("Painting JavaFX stage");
        stage.setScene(new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT));
        stage.setTitle("HolloRay");
        stage.show();
        return new __done();
      case "cube":
        SpawnBox((double) args[1].value());
        return new __done();
      case "cylinder":
        SpawnCylinder((double) args[1].value(), (double) args[2].value());
        return new __done();
      default:
        Shout("Unknown internal command: " + args[0]);
        return new __string("OH NO!");
    }
  }

  private void SpawnBox(double side_length) {
    Shout("Spawning a box with side length " + side_length);
    Box box = new Box();
    box.setDepth(side_length);
    box.setHeight(side_length);
    box.setWidth(side_length);
    root.getChildren().add(box);
  }

  private void SpawnCylinder(double radius, double height) {
    Shout("Spawning a cylinder with radius " + radius + " and height " + height);
    Cylinder cylinder = new Cylinder();
    cylinder.setRadius(radius);
    cylinder.setHeight(height);
    cylinder.setTranslateY(SCREEN_HEIGHT / 2);
    cylinder.setTranslateX(SCREEN_WIDTH / 2);
    root.getChildren().add(cylinder);
  }
}
