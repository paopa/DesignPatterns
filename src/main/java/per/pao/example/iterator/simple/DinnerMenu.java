package per.pao.example.iterator.simple;

public class DinnerMenu implements Menu{

    private final static int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon ...", true, 2.99);
        addItem("BLT", "Bacon ...", false, 2.99);
        addItem("Soup of the day", "Soup of the day ...", false, 3.29);
        addItem("Hotdog", "real dog in ...", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
            return;
        }
        menuItems[numberOfItems] = item;
        numberOfItems += 1;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    // remove this method
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

}
