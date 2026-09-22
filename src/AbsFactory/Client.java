package AbsFactory;
import AbsFactory.AbsProd.*;



public class Client {
    private Boss boss;
    private Minion minion;

    public Client(AbsFactory factory) {
        boss = factory.createBoss();
        minion = factory.createMinion();
    }

    public void startLevel() {
        System.out.println("Запуск игрового уровня...");
        minion.patrol();
        boss.specialAttack();
    }
}
