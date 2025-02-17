package creational.singleton_pattern.after;

public class Logger {
  private static Logger INSTANCE;

  private Logger() {
  }

  public static Logger getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Logger();
    }
    return INSTANCE;
  }

  void log(String logMessage) {
    System.out.println("Logging: " + logMessage);
  }
}
