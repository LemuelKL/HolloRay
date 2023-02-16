import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Image2Test extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("A window");
    // Group group = new Group();
    // VBox group = new VBox();
    HBox group = new HBox();
    Scene scene = new Scene(group);

    Image image = new Image("GERTank.png", 400, 0, true, true);
    ImageView imageView = new ImageView(image);

    group.getChildren().add(imageView);

    group.getChildren().add(new ImageView(image));

    primaryStage.setWidth(1000);
    primaryStage.setHeight(800);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
