package per.pao.example.template.duck;

public class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        if (this.weight > duck.weight) {
            return 1;
        } else if (this.weight < duck.weight) {
            return -1;
        } else {
            return 0;
        }
    }
}
