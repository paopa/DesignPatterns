package per.pao.example.adapter.duck;

import per.pao.example.adapter.duck.adapter.TurkeyAdapter;
import per.pao.example.adapter.duck.animal.Duck;
import per.pao.example.adapter.duck.animal.MallardDuck;
import per.pao.example.adapter.duck.animal.Turkey;
import per.pao.example.adapter.duck.animal.WildTurkey;

public class Application {

    public static void main(String[] args) {
        duckAdapterDemo();
    }

    private static void duckAdapterDemo() {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Duck fakeDuck = new TurkeyAdapter(turkey);
        fakeDuck.quack();
        fakeDuck.fly();
    }
}
