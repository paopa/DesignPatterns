package per.pao.example.util.cost;

import per.pao.example.util.cost.object.CostObject;

public class CostUtil {

    public static CostObject getInstance(){
        return new CostObject();
    }

    public static void printCost(CostObject cost) {
        System.out.printf("time cost: %d ms\n", (System.currentTimeMillis() - cost.getStartDate()));
    }

}
