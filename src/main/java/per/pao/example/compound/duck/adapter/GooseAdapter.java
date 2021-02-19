package per.pao.example.compound.duck.adapter;

import per.pao.example.compound.duck.Quackable;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
