package creational.abstract_factory_pattern.after;

public class App {
  public static void main(String[] args) {

    UserInterface roadUserInterface = createUserInterface("RED");
    UserInterface mountainUserInterface = createUserInterface("BLUE");

    System.out.println(roadUserInterface);
    System.out.println(mountainUserInterface);
  }

  public static UserInterface createUserInterface(String theme) {
    UserInterfaceFactory userInterfaceFactory = FactoryMaker.getFactory(theme);
    Button button = userInterfaceFactory.createButton();
    ScrollBar scrollBar = userInterfaceFactory.createScrollBar();
    return new UserInterface(button, scrollBar);
  }
}
