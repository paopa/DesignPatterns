package per.pao.example.template.simple;

public class Application {

    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        testCoffee();
        testTea();
    }

    private static void testTea() {
        System.out.println("Tea test~~");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        System.out.println();
    }

    private static void testCoffee() {
        System.out.println("Coffee test!!");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println();
    }
}
