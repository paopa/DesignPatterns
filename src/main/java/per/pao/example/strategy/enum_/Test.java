package per.pao.example.strategy.enum_;

public final class Test
{
    public static void main(String[] args)
    {
        UseStrategy useStrategy = new UseStrategy();
        useStrategy.preform(UseStrategy.Strategy.STRATEGY_A);
        useStrategy.preform(UseStrategy.Strategy.STRATEGY_B);
    }
}

final class UseStrategy
{
    public void preform(Strategy strategy)
    {
        strategy.execute();
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
}
