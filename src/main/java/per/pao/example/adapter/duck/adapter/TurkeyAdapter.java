package per.pao.example.adapter.duck.adapter;

import per.pao.example.adapter.duck.animal.Duck;
import per.pao.example.adapter.duck.animal.Turkey;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        int i = 0;
        while (i < 5) {
            turkey.fly();
            i++;
        }
    }
}
