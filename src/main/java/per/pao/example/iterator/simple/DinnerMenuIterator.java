package per.pao.example.iterator.simple;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 1;
        return item;
    }
}
