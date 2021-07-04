package per.pao.example.flyweight.tree;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Forest
        extends JFrame
{
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String description)
    {
        final Tree.Type type = Tree.Type.Factory.createOrGet(name, color, description);
        final Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g)
    {
        trees.forEach(tree -> tree.draw(g));
    }
}
