package per.pao.example.template.duck;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        Duck[] ducks = prepare();
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        Arrays.stream(ducks).forEach(duck -> System.out.println(duck.toString()));
    }

    private static Duck[] prepare() {
        return new Duck[]{
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 10),
                new Duck("Donald", 2),
                new Duck("Huey", 10),
                new Duck("David", 2),
                new Duck("Vicent", 9)
        };
    }
}
