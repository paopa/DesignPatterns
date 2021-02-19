package per.pao.example.compound.dock.adapter;

import per.pao.example.compound.dock.Quackable;

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
