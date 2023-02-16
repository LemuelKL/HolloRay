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

  Group root;

  @Override
  public String name() {
    return "HolloRay's JavaFX Plugin";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    root = new Group();
    root.getChildren().add(new Label(args[0].toString() + "\n" + args[1].toString() + "\n" + args[2].toString()));

    System.out.println("I'm from Hong Kong!");
    SpawnBox();

    Stage stage = new Stage();
    stage.setScene(new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT));
    stage.setTitle("HolloRay");
    stage.show();

    return new __string("Hello, World!");
  }

  private void SpawnBox() {
    Box box = new Box();
    box.setDepth(50);
    box.setHeight(50);
    box.setWidth(50);
    root.getChildren().add(box);
  }
}
