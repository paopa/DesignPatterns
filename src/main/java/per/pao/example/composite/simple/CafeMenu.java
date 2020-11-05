package per.pao.example.composite.simple;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on ...", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day ...", false, 3.69);
        addItem("Burrito", "A large burrito ...", true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.put(item.getName(), item);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
