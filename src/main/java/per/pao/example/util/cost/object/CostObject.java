package per.pao.example.util.cost.object;

public class CostObject {

    private final long time = System.currentTimeMillis();;
    private final Runtime runtime = Runtime.getRuntime();;

    public long costTime() {
        return System.currentTimeMillis() - time;
    }

    public long usageMemory() {
        runtime.gc();
        return runtime.totalMemory() - runtime.freeMemory();
    }

}
