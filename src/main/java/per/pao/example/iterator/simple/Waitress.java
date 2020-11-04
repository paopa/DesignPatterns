package per.pao.example.iterator.simple;

public class Waitress {

    private String name;
    private DinnerMenu dinnerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(String name, PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.name = name;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("MENU\n-----------------");
        System.out.println("BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator pancakeIterator) {
        while (pancakeIterator.hasNext()) {
            MenuItem item = (MenuItem) pancakeIterator.next();
            System.out.printf("%s %f %s\n", item.getName(), item.getPrice(), item.getDescription());
        }
    }

//    public void printMenu() {
//        ArrayList breakfastMenu = pancakeHouseMenu.getMenuItems();
//        MenuItem[] lunchItems = dinnerMenu.getMenuItems();
//
//        for (int i = 0; i < breakfastMenu.size(); i++) {
//            MenuItem item = (MenuItem) breakfastMenu.get(i);
//            System.out.printf("%s %f %s\n", item.getName(), item.getPrice(), item.getDescription());
//        }
//
//        for (int i = 0; i < lunchItems.length; i++) {
//            MenuItem item = lunchItems[i];
//            System.out.printf("%s %f %s\n", item.getName(), item.getPrice(), item.getDescription());
//        }
//    }
}
