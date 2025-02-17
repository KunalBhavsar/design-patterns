package creational.prototype_pattern.after;

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
  public Building clone() {
    return new Building(super.getHeightInPixels(), new BuildingType(buildingType.getType()));
  }

  @Override
  public String toString() {
    return "Building{" +
        "buildingType=" + buildingType +
        ", heighInPixels=" + super.getHeightInPixels() +
        '}';
  }
}
