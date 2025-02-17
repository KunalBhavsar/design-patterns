package creational.builder_pattern.after;

import creational.builder_pattern.after.StoreItem.StoreItemBuilder;

public class ItemRegistry {

  public static void main(String[] args) {

    var item1 = new StoreItemBuilder("Pretzel", 2.0)
        .withShortDescription("A tasty snack")
        .withStockAvailable(7)
        .build();

    var item2 = new StoreItemBuilder("Soup", 1.5)
        .withLongDescription(
            "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
        .withPackagingType("Can")
        .build();

    addToItemRegistry(item1);
    addToItemRegistry(item2);
  }

  private static void addToItemRegistry(StoreItem storeItem) {
    System.out.println("A new item was added to the registry: \n" + storeItem);
  }
}