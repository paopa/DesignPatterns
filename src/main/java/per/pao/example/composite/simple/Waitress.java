package per.pao.example.composite.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {

    private String name;
    private Menu dinnerMenu;
    private Menu pancakeHouseMenu;
    private Menu cafeMenu;
    private List menus = new ArrayList();

    public Waitress(String name, Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.name = name;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public Waitress(String name, List menus) {
        this.name = name;
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            System.out.println();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator pancakeIterator) {
        while (pancakeIterator.hasNext()) {
            MenuItem item = (MenuItem) pancakeIterator.next();
            System.out.printf("%s %f %s\n", item.getName(), item.getPrice(), item.getDescription());
        }
    }

    /**
     * print menu version 2
     */
//    public void printMenu() {
//        Iterator dinnerIterator = dinnerMenu.createIterator();
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator cafeIterator = cafeMenu.createIterator();
//        System.out.println("MENU\n-----------------");
//        System.out.println("BREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinnerIterator);
//        System.out.println("\nCAFE");
//        printMenu(cafeIterator);
//        System.out.println();
//    }

    /**
     * print menu version 1
     */
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
