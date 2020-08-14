package per.pao.example.singleton;

import per.pao.example.util.CostUtil;

import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        checkIsSingleton();
//        checkSynchronizedWaste();
        long end = System.currentTimeMillis();
        CostUtil.printCost(start, end);
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
