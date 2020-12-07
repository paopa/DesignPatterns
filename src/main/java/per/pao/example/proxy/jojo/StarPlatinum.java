package per.pao.example.proxy.jojo;

public class StarPlatinum implements Character {

    private Jotaro master;

    public StarPlatinum() {
        this.master = new Jotaro();
    }

    @Override
    public void attack() {
        this.master.attack();
    }
}
