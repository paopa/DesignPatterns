package per.pao.example.strategy.adventure;

/**
 * Strategy design pattern test
 */
public class Test {
    public static void main(String[] args) {
        Adventurer pao = new Adventurer("pao");
        pao.attack();
        pao.choiceStrategy(new UseSkill());
        pao.attack();
        pao.choiceStrategy(new UseItem());
        pao.attack();
    }
}
