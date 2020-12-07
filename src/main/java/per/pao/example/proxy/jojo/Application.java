package per.pao.example.proxy.jojo;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        StarPlatinum starPlatinum = new StarPlatinum();
        starPlatinum.attack();
    }
}
