package per.pao.example.proxy.server;

public class RealSubject implements Subject {

    private String name;

    public RealSubject(String name) {
        this.name = name;
        System.out.println("This is " + name);
    }

    @Override
    public void request(String resource) {
        System.out.println("This is response of " + resource + " from server :" + this.name);
    }
}
