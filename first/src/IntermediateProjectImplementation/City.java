package IntermediateProjectImplementation;

public class City {

    private Building[] buildings = new Building[4];

    public City()
    {
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Latter Opener ", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItem = new Item[2];
        mansionItem[0] = new Item("Shoes", 25.0);
        mansionItem[1] = new Item("Broken Glass", 0.1);
        buildings[1] = new Building("Mansion Item", mansionItem);

        Item[] postOfficeItem = new Item[2];
        postOfficeItem[0] = new Item("Letter", 2.0);
        postOfficeItem[1] = new Item("Money Order", 20);
        buildings[2] = new Building("Post office Items :", postOfficeItem);

        Item[] superMarketItems = new Item[2];
        superMarketItems[0] = new Item("Bread", 2.5);
        superMarketItems[1] = new Item("A bag of tea", 6.5);
        buildings[3] = new Building("Super Market Items : ", superMarketItems);
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
