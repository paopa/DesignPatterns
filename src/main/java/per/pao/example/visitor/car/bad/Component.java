package per.pao.example.visitor.car.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a bad design demo
 */
class Demo
{
    public static void main(String[] args)
    {
        Car car = new Car(List.of(new Wheel(), new Wheel(), new Wheel()));
        car.setComponent(new Engine());
        car.setComponent(new Wheel());
        car.print();
    }
}

public interface Component
{
    void printMessage();
}

class Wheel
        implements Component
{

    @Override
    public void printMessage()
    {
        System.out.println("This is a wheel");
    }

    public void doWheel()
    {
        System.out.println("Checking wheel");
    }
}

class Engine
        implements Component
{

    @Override
    public void printMessage()
    {
        System.out.println("This is a engine");
    }

    public void doEngine()
    {
        System.out.println("Testing this engine");
    }
}

class Car
{
    private final List<Component> components = new ArrayList<>();

    public Car()
    {
        this(null);
    }

    public Car(List<Component> list)
    {
        list.forEach(this::setComponent);
    }

    public void setComponent(Component component)
    {
        /*Will be more complex, after we implement more component*/
        if (component instanceof Wheel) {
            ((Wheel) component).doWheel();
        }
        else if (component instanceof Engine) {
            ((Engine) component).doEngine();
        }
        components.add(component);
    }

    public void print(){
        components.forEach(Component::printMessage);
    }
}

