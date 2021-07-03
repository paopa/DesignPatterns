package per.pao.example.observer.news.paper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo
{
    public static void main(String[] args)
            throws ExecutionException, InterruptedException
    {
        NewspaperOffice office = new NewspaperOffice();
        final ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            int i = 0;
            while (office.getCustomerSize() > 0 || i ==0) {
                try {
                    office.sendNewspaper("message-" + i++);
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        final List<Customer> list = List.of(
                new Customer("A"),
                new Customer("B"),
                new Customer("C"));
        service.submit(() ->
                list.forEach(customer -> {
                    office.subscribeNewspaper(customer);
                    try {
                        Thread.sleep(4000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                })
        ).get();
        Thread.sleep(10000);
        service.submit(() -> list.forEach(customer -> {
            office.unsubscribeNewspaper(customer);
            try {
                Thread.sleep(4000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        })).get();
        service.shutdownNow();
    }
}

interface ISubject
{
    boolean registerObserver(IObserver observer);

    boolean removeObserver(IObserver observer);

    void notifyObservers(String content);
}

interface IObserver
{
    void update(String content);
}

class NewspaperOffice
        implements ISubject
{
    private final List<IObserver> list = new ArrayList<>();

    public int getCustomerSize() {return this.list.size();}

    @Override
    public boolean registerObserver(IObserver observer)
    {
        if (list.contains(observer)) {
            return false;
        }
        return list.add(observer);
    }

    @Override
    public boolean removeObserver(IObserver observer)
    {
        if (!list.contains(observer)) {
            return false;
        }
        return list.remove(observer);
    }

    @Override
    public void notifyObservers(String content)
    {
        list.forEach(observer -> observer.update(content));
    }

    public void subscribeNewspaper(IObserver customer)
    {
        registerObserver(customer);
    }

    public void unsubscribeNewspaper(IObserver customer)
    {
        removeObserver(customer);
    }

    public void sendNewspaper(String content)
    {
        System.out.println("Sending newspaper...");
        notifyObservers(content);
    }
}

class Customer
        implements IObserver
{

    private final String name;

    public Customer(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String content)
    {
        System.out.printf("customer: %s receive a news: %s%n", this.name, content);
    }
}