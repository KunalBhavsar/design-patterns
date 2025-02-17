package creational.factory_method_pattern.after;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {
  private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

  static {
    snackMap.put("Chips", Chips::new);
    snackMap.put("Chocolate Bar", ChocolateBar::new);
    snackMap.put("Drink", Drink::new);
  }

  Snack getSnack(String snackType) {
    if (snackMap.get(snackType) != null) {
      return snackMap.get(snackType).get();
    }

    throw new IllegalArgumentException("Invalid snack type");
  }
}
