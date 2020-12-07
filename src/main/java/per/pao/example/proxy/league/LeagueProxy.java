package per.pao.example.proxy.league;

public class LeagueProxy implements Team {

    private League league;

    public LeagueProxy() {
        this.league = new League();
    }

    @Override
    public boolean join(String name) {
        if (this.league.isExist(name)) {
            return false;
        }
        return this.league.join(name);
    }

    @Override
    public boolean quit(String name) {
        if (this.league.isExist(name)) {
            return this.league.quit(name);
        }
        return false;
    }
}
