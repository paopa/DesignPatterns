package per.pao.example.composite.simple;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {

    private final ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancake with ...", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with ...", false, 2.99);
        addItem("Blueberry Pancake", "Pancake made with fresh blueberries ", true, 3.49);
        addItem("Waffles", "Waffles ...", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PancakeIterator(menuItems);
    }

    // remove this method
    public ArrayList getMenuItems() {
        return menuItems;
    }

}
