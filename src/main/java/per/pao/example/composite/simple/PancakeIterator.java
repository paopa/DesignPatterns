package per.pao.example.composite.simple;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeIterator implements Iterator<MenuItem> {

    ArrayList items;
    int position = 0;

    public PancakeIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = (MenuItem) items.get(position);
        position += 1;
        return item;
    }
}
