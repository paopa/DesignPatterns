package per.pao.example.proxy.server;

public class Application {
    public static void main(String[] args) {
        Subject server = new Proxy("test-1");
        server.request("google.com");
    }
}
