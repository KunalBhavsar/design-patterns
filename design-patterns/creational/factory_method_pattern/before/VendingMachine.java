package creational.factory_method_pattern.before;

public class VendingMachine {
  Snack getSnack(String snackType) {
    if (snackType == null) {
      return null;
    }
    if (snackType.equalsIgnoreCase("Chips")) {
      return new Chips();
    } else if (snackType.equalsIgnoreCase("Chocolate Bar")) {
      return new ChocolateBar();
    } else if (snackType.equalsIgnoreCase("Drink")) {
      return new Drink();
    }

    return null;
  }
}
