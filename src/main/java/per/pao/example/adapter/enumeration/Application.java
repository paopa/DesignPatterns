package per.pao.example.adapter.enumeration;

import per.pao.example.adapter.enumeration.adapter.EnumerationIterator;

import java.util.Iterator;
import java.util.Vector;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        Vector dayNames = prepareDemo();
        Iterator days = new EnumerationIterator(dayNames.elements());
        while (days.hasNext()){
            System.out.println(days.next());
        }
//        days.remove();
    }

    private static Vector prepareDemo() {
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        return dayNames;
    }
}
