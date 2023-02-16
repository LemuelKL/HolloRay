import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class ValueUserPlugin implements ValueUserPluginInterface {

  static int SCREEN_WIDTH = 800;
  static int SCREEN_HEIGHT = 600;

  static Group root;
  static Stage stage;

  @Override
  public String name() {
    return "HolloRay's JavaFX Plugin";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    final Value arg1 = args[0];
    final Value arg2 = args[1];
    final Value arg3 = args[2];

    switch (args[0].value().toString()) {
      case "init":
        System.out.println("Initialising JavaFX stage");
        stage = new Stage();
        root = new Group();
        return new __done();
      case "paint":
        System.out.println("Painting JavaFX stage");
        stage.setScene(new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT));
        stage.setTitle("HolloRay");
        stage.show();
        return new __done();
      case "cube":
        SpawnBox((double) arg2.value());
        return new __done();
      default:
        System.out.println("Unknown internal command: " + args[0].value());
        return new __string("OH NO!");
    }
  }

  private void SpawnBox(double side_length) {
    System.out.println("Spawning a box with side length " + side_length);
    Box box = new Box();
    box.setDepth(side_length);
    box.setHeight(side_length);
    box.setWidth(side_length);
    root.getChildren().add(box);
  }
}
