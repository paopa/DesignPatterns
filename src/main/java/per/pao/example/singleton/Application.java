package per.pao.example.singleton;

import per.pao.example.singleton.simple.SimpleSingleton;
import per.pao.example.util.cost.CostUtil;
import per.pao.example.util.cost.object.CostObject;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        CostObject cost = CostUtil.getInstance();
//        checkIsSingleton();
//        checkSynchronizedWaste();
        checkMultiThread();
        CostUtil.printCost(cost);
    }

    private static void checkMultiThread() throws InterruptedException {
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
