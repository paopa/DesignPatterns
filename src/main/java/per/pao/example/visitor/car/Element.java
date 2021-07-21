package per.pao.example.visitor.car;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * @see <a href=http://corrupt003-design-pattern.blogspot.com/2017/02/visitor-pattern.html>visitor-pattern</a>
 */
class Demo
{
    public static void main(String[] args)
    {
        final Element car = new Car();
        car.accept(new Element.Visitor.DoVisitor());
        car.accept(new Element.Visitor.PrintVisitor());
    }
}

public interface Element
{
    void accept(final Visitor visitor);

    interface Visitor
    {
        void visit(final Body body);

        void visit(final Car car);

        void visit(final Wheel wheel);

        void visit(final Engine engine);

        class DoVisitor
                implements Visitor
        {

            @Override
            public void visit(Body body)
            {
                System.out.println("Moving my body");
            }

            @Override
            public void visit(Car car)
            {
                System.out.println("Starting my car");
            }

            @Override
            public void visit(Wheel wheel)
            {
                System.out.println(format("Kicking my %s wheel", wheel.getName()));
            }

            @Override
            public void visit(Engine engine)
            {
                System.out.println("Starting my engine");
            }
        }

        class PrintVisitor
                implements Visitor
        {

            @Override
            public void visit(Body body)
            {
                System.out.println("Visiting body");
            }

            @Override
            public void visit(Car car)
            {
                System.out.println("Visiting car");
            }

            @Override
            public void visit(Wheel wheel)
            {
                System.out.println(format("Visiting %s wheel", wheel.getName()));
            }

            @Override
            public void visit(Engine engine)
            {
                System.out.println("Visiting engine");
            }
        }
    }
}

class Body
        implements Element
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}

class Wheel
        implements Element
{
    private final String name;

    public Wheel(String name)
    {
        this.name = name;
    }

    public String getName() {return this.name;}

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}

class Engine
        implements Element
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}

class Car
        implements Element
{
    private final List<Element> elements = new ArrayList<>();

    public Car()
    {
        this(List.of(
                new Wheel("front left"), new Wheel("front right"),
                new Wheel("back left"), new Wheel("back right"),
                new Engine()
        ));
    }

    public Car(List<Element> list)
    {
        elements.addAll(list);
    }

    @Override
    public void accept(Visitor visitor)
    {
        elements.forEach(element -> element.accept(visitor));
        visitor.visit(this);
    }
}