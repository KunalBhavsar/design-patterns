package creational.abstract_factory_pattern.after;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  private static Map<String, Supplier<UserInterfaceFactory>> factories = new HashMap<>();

  static {
    factories.put("RED", RedUserInterfaceFactory::new);
    factories.put("BLUE", BlueUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory getFactory(String color) {
    if (!factories.containsKey(color)) {
      throw new IllegalArgumentException("No such factory for color: " + color);
    }
    return factories.get(color).get();
  }
}
