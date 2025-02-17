package creational.abstract_factory_pattern.before;

public class App {
  public static void main(String[] args) {
    UserInterface roadUserInterface = createUserInterface("RED");
    UserInterface mountainUserInterface = createUserInterface("BLUE");

    System.out.println(roadUserInterface);
    System.out.println(mountainUserInterface);
  }

  public static UserInterface createUserInterface(String theme) {
    if (theme.equals("RED")) {
      return new UserInterface(new RedButton(), new RedScrollBar());
    } else if (theme.equals("BLUE")) {
      return new UserInterface(new BlueButton(), new BlueScrollBar());
    }

    throw new IllegalArgumentException("Unknown theme");
  }
}
