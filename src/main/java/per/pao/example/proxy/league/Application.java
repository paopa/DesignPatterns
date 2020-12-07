package per.pao.example.proxy.league;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        Team proxy = new LeagueProxy();
        System.out.println(proxy.join("HeroA"));
        System.out.println(proxy.join("HeroB"));
        System.out.println(proxy.join("HeroA"));
        System.out.println(proxy.quit("HeroC"));
    }
}
