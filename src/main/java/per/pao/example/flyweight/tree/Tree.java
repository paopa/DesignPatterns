package per.pao.example.flyweight.tree;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Objects.isNull;

public class Tree
{
    private final int x;
    private final int y;
    private final Type type;

    public Tree(int x, int y, Type type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics graphics)
    {
        type.draw(graphics, this.x, this.y);
    }

    public static final class Type
    {
        private final String name;
        private final Color color;
        private final String description;

        Type(String name, Color color, String description)
        {
            this.name = name;
            this.color = color;
            this.description = description;
        }

        public void draw(Graphics graphics, int x, int y)
        {
            graphics.setColor(Color.BLACK);
            graphics.setClip(x - 1, y, 3, 5);
            graphics.setColor(this.color);
            graphics.setClip(x - 5, y - 10, 10, 10);
        }

        public static final class Factory
        {
            private static final Map<String, Type> MAP = new HashMap<>();

            private Factory() {}

            public static Type createOrGet(String name, Color color, String description)
            {
                Type type = MAP.get(name);
                if (isNull(type)) {
                    type = new Type(name, color, description);
                    MAP.put(name, type);
                }
                return type;
            }
        }
    }
}
