package per.pao.example.flyweight.tree;

import java.awt.Color;
import java.util.stream.LongStream;

public class Demo
        extends Thread
{
    public static final int CANVAS_SIZE = 500;
    public static final int TREES_TO_DRAW = 1_000_000;
    public static final int TREE_TYPES = 2;

    public static void main(String[] args)
    {
        new Demo().start();
    }

    @Override
    public void run()
    {
        final Forest forest = new Forest();
        LongStream.range(0, (long) Math.floor(TREES_TO_DRAW / TREE_TYPES))
                .forEach((ignore) -> {
                    forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                            "Summer Oak", Color.GREEN, "Oak texture stub");
                    forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                            "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
                });
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("------------------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size(8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ Tree Type size (~30 bytes) * " + TREE_TYPES);
        System.out.println("------------------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max)
    {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
