package per.pao.example.strategy.enum_.map;

import java.util.EnumMap;

public class Test
{
    public static void main(String[] args)
    {
        Map.lookupStrategy.get(Strategy.valueOf("STRATEGY_A")).execute();
        Map.lookupStrategy.get(Strategy.valueOf("STRATEGY_B")).execute();
    }
}

class Map
{
    public static final EnumMap<Strategy, Strategy> lookupStrategy = new EnumMap<>(Strategy.class);

    static {
        lookupStrategy.put(Strategy.STRATEGY_A, Strategy.STRATEGY_A);
        lookupStrategy.put(Strategy.STRATEGY_B, Strategy.STRATEGY_B);
    }
}

enum Strategy
{
    STRATEGY_A {
        @Override
        void execute()
        {
            System.out.println("Executing strategy_a");
        }
    },
    STRATEGY_B {
        @Override
        void execute()
        {
            System.out.println("Executing strategy_b");
        }
    };

    abstract void execute();
}
