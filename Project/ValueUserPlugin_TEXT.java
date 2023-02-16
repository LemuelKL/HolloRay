import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;

public class ValueUserPlugin implements ValueUserPluginInterface {

  @Override
  public String name() {
      return "Adrian's example ValueUserPlugin for demonstrating unpacking";
  }

  @Override
  public Value user(Value... args) throws ARTException {
      for (Value a : args) {
      if (a.value().getClass().isArray()) {
        Value[] v = (Value[]) a.value();

        System.out.println("__array of length " + v.length + " with contents");
        for (int i = 0; i < v.length; i++)
          System.out.println("  " + i + ":" + v[i] + " which has underlying Java " + v[i].getClass() + " and value " + v[i].value());
      } else
        System.out.println(a + " which has underlying Java " + a.value().getClass() + " and value " + a.value());
    }
    return new __string("Return value from text example plugin");
  }
}
