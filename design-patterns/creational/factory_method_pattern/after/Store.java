package creational.factory_method_pattern.after;

public class Store {
  private static final VendingMachine VENDING_MACHINE = new VendingMachine();

  public static void main(String[] args) {
    buySnack("Chocolate Bar");
    buySnack("Chips");
    buySnack("Drink");
  }

  public static void buySnack(String snackType) {
    Snack snack = VENDING_MACHINE.getSnack(snackType);
    System.out.println("Price of " + snackType + " is " + snack.getPrice());
  }
}
