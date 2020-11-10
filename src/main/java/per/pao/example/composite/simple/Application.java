package per.pao.example.composite.simple;

public class Application {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        MenuComponent cafeMenu = prepareCafeMenu();
        MenuComponent pancakeHouseMenu = preparePancakeHouseMenu();
        MenuComponent dessertMenu = prepareDessertMenu();
        MenuComponent dinnerMenu = prepareDinerMenu();
        dinnerMenu.add(dessertMenu);
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        Waitress waitress = new Waitress("Alice", allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    private static MenuComponent prepareDinerMenu() {
        MenuComponent dinnerMenu = generateMenus("DINNER MENU", "Lunch");
        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with ...", true, 3.89));
        dinnerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon ...", true, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day", "Soup of the day ...", false, 3.29));
        dinnerMenu.add(new MenuItem("Hotdog", "real dog in ...", false, 3.05));
        return dinnerMenu;
    }

    private static MenuComponent prepareDessertMenu() {
        MenuComponent dessertMenu =generateMenus("DESSERT MENU", "Dessert of course!");
        dessertMenu.add(new MenuItem("Apple pie", "Apple ...", true, 1.59));
        return dessertMenu;
    }

    private static MenuComponent preparePancakeHouseMenu() {
        MenuComponent pancakeHouseMenu = generateMenus("PANCAKE HOUSE MENU", "Breakfast");
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancake with ...", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancake with ...", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake", "Pancake made with fresh blueberries ", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles ...", true, 3.59));
        return pancakeHouseMenu;
    }

    private static MenuComponent prepareCafeMenu() {
        MenuComponent cafeMenu = generateMenus("CAFE MENU", "Dinner");
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on ...", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day ...", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito ...", true, 4.29));
        return cafeMenu;
    }

    private static Menu generateMenus(String name, String description) {
        return new Menu(name, description);
    }
}
