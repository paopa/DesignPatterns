package per.pao.example.singleton;

public class SimpleSingleton {

    private static SimpleSingleton uniqueInstance;

    private SimpleSingleton() {
        System.out.println("private constructor ");
    }

    public static synchronized SimpleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SimpleSingleton();
        }
        return uniqueInstance;
    }
}
