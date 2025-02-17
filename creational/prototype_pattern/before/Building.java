package creational.prototype_pattern.before;

public class Building extends Graphic {
  private BuildingType buildingType;

  public Building(int heighInPixels, BuildingType buildingType) {
    super(heighInPixels);
    this.buildingType = buildingType;
  }

  public BuildingType getBuildingType() {
    return buildingType;
  }

  public void setBuildingType(BuildingType buildingType) {
    this.buildingType = buildingType;
  }

  @Override
  public String toString() {
    return "Building{" +
        "buildingType=" + buildingType +
        ", heighInPixels=" + super.getHeightInPixels() +
        '}';
  }
}
