package creational.singleton_pattern.after;

public class Dog {
  private final Logger logger = Logger.getInstance();

  public void woof() {
    logger.log("Woof");
  }
}
