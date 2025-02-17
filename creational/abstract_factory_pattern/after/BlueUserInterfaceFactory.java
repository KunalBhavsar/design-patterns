package creational.abstract_factory_pattern.after;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {
  @Override
  public Button createButton() {
    return new BlueButton();
  }

  @Override
  public ScrollBar createScrollBar() {
    return new BlueScrollBar();
  }
}
