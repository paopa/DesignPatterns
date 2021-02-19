package per.pao.example.compound.dock.composite;

import per.pao.example.compound.dock.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private final List<Quackable> list = new ArrayList<>();

    public void add(Quackable duck) {
        list.add(duck);
    }

    @Override
    public void quack() {
        list.forEach(Quackable::quack);
    }
}
