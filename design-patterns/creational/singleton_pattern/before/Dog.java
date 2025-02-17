package creational.singleton_pattern.before;

public class Dog {
  private final Logger logger = new Logger();

  public void woof() {
    logger.log("Woof");
  }
}
