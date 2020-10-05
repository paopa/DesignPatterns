package per.pao.example.util.cost;

import per.pao.example.util.cost.object.CostObject;

public class CostUtil {

    private final static long MB = 1_000_000;

    public static CostObject getInstance() {
        return new CostObject();
    }

    public static void printCost(CostObject cost) {
        System.out.printf("runtime cost: %d ms \n", cost.costTime());
        System.out.printf("memory usage: %f mb \n", convertMemoryTo(cost.usageMemory(), MB));
    }

    private static Float convertMemoryTo(long memory, long unit) {
        return (float) memory / unit;
    }

//    public static void main(String[] args) {
//        CostObject cost = CostUtil.getInstance();
//        java.util.List<Integer> x = new java.util.ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            x.add(i);
//        }
//        CostUtil.printCost(cost);
//    }
}