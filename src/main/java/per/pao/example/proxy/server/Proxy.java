package per.pao.example.proxy.server;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(String serverName) {
        this.realSubject = new RealSubject(serverName);
    }

    @Override
    public void request(String resource) {
        realSubject.request(resource);
    }
}
