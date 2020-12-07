package per.pao.example.proxy.league;

import java.util.HashSet;
import java.util.Set;

public class League implements Team {

    private Set<String> heroSet = new HashSet<>();

    @Override
    public boolean join(String name) {
        return heroSet.add(name);
    }

    @Override
    public boolean quit(String name) {
        return heroSet.remove(name);
    }

    public boolean isExist(String name) {
        return heroSet.contains(name);
    }
}
