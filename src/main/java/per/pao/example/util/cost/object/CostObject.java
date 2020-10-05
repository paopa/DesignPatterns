package per.pao.example.util.cost.object;

public class CostObject {

    private long startDate;

    public CostObject() {
        startDate = System.currentTimeMillis();
    }

    public long getStartDate() {
        return startDate;
    }
}
