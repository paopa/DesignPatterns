package per.pao.example.singleton;

import per.pao.example.singleton.simple.SimpleSingleton;
import per.pao.example.util.CostUtil;

public class Application {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        checkIsSingleton();
//        checkSynchronizedWaste();
        checkMultiThread();
        long end = System.currentTimeMillis();
        CostUtil.printCost(start, end);
    }

    private static void checkMultiThread() {
        Thread a = new Thread(() -> {
             SimpleSingleton a1 = SimpleSingleton.getInstance();
             System.out.println(a1);
        });
        Thread b = new Thread(() -> {
            SimpleSingleton b1 = SimpleSingleton.getInstance();
            System.out.println(b1);
        });

        a.start();
        b.start();
    }

    private static void checkSynchronizedWaste() {
        int i = 0;
        while (i < 10000000) {
            SimpleSingleton.getInstance();
            i++;
        }
    }

    private static void checkIsSingleton() {
        SimpleSingleton a = SimpleSingleton.getInstance();
        System.out.println("A: " + a.toString());
        SimpleSingleton b = SimpleSingleton.getInstance();
        System.out.println("B: " + b.toString());
        System.out.println("check");
    }
}
