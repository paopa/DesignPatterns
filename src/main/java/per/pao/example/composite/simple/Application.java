package per.pao.example.composite.simple;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Waitress waitress = new Waitress("Alice", generateMenus());
        waitress.printMenu();
    }

    private static List generateMenus() {
        return List.of(new CafeMenu(),new DinnerMenu(),new PancakeHouseMenu());
    }
}
