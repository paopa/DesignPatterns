package per.pao.example.singleton;

public class SimpleSingleton {

    private static volatile SimpleSingleton uniqueInstance;
//    private static final SimpleSingleton uniqueInstance = new SimpleSingleton();

    private SimpleSingleton() {
        System.out.println("private constructor ");
    }

//    public static SimpleSingleton getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (SimpleSingleton.class) {
//                if (uniqueInstance == null) {
//                    uniqueInstance = new SimpleSingleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }

//    public static SimpleSingleton getInstance() {
//        return uniqueInstance;
//    }

//    public static synchronized SimpleSingleton getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new SimpleSingleton();
//        }
//        return uniqueInstance;
//    }

    public static SimpleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SimpleSingleton();
        }
        return uniqueInstance;
    }
}
