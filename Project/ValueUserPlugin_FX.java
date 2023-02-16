import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ValueUserPlugin implements ValueUserPluginInterface {

  @Override
  public String name() {
      return "Adrian's example ValueUserPlugin for demonstrating JavaFX";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    Group root = new Group();
    root.getChildren().add(new Label(args[0].toString()));

    Stage stage = new Stage();
    stage.setScene(new Scene(root, 300, 250));
    stage.show();

    return new __string("Return value from JavaFX example plugin");
  }
}
