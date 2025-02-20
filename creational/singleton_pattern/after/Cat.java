package creational.singleton_pattern.after;

public class Cat {
  private final Logger logger = Logger.getInstance();

  public void meow() {
    logger.log("Meow");
  }
}
