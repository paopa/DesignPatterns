package per.pao.example.iterator.simple;

public class Application {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Waitress waitress = new Waitress("Alice", new PancakeHouseMenu(), new DinnerMenu());
        waitress.printMenu();
    }
}
