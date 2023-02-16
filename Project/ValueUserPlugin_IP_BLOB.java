import java.util.HashMap;
import java.util.Map;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.Value;
import uk.ac.rhul.cs.csle.art.value.ValueUserPluginInterface;
import uk.ac.rhul.cs.csle.art.value.__done;
import uk.ac.rhul.cs.csle.art.value.__blob;

public class ValueUserPlugin implements ValueUserPluginInterface {

  @Override
  public String name() {
    return "Adrian's example ValueUserPlugin for demonstrating image processing using __blob";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    switch ((int) args[0].value()) {
    case 1: // Load
      Image fromFileImage = new Image("GERTank.png");
      WritableImage inputImage = new WritableImage(fromFileImage.getPixelReader(), (int) fromFileImage.getWidth(), (int) fromFileImage.getHeight());
      ImageView inputImageView = new ImageView(inputImage);
      Group root = new Group();
      root.getChildren().add(inputImageView);
      Stage stage = new Stage();
      stage.setTitle((String) args[1].value());
      stage.setScene(new Scene(root, 800, 600));
      stage.show();
      return new __blob(inputImage);

    case 2: // Invert
      WritableImage originalImage = (WritableImage) args[1].value();
 
      PixelReader pixelReader = originalImage.getPixelReader();
      PixelWriter pixelWriter = originalImage.getPixelWriter();

      for (int readY = 1; readY < originalImage.getHeight() - 1; readY++) {
        for (int readX = 1; readX < originalImage.getWidth() - 1; readX++) {
          double p0 = pixelReader.getColor(readX, readY).grayscale().getRed();
          p0 = 1.0 - p0;
          pixelWriter.setColor(readX, readY, new Color(p0, p0, p0, 1));
        }
      }
      return new __done();

    default:
      throw new ARTException("ValueUserPlugin: unknown opcode ");
    }
  }
}
