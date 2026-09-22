import AbsFactory.*;
import AbsFactory.ConcFac.ForestMonsterFactory;
import Factory.EnemyCreater;
import Factory.ConcCreater.*;

public class MainPartA {
    public static void main(String[] args) {

        EnemyCreater goblinSpawner = new GoblinSpawner();
        goblinSpawner.spawnAndAttack();

        EnemyCreater skeletonSpawner = new SkeletSpawner();
        skeletonSpawner.spawnAndAttack();
    

        System.out.println("\n Select world to game ");
        AbsFactory forestFactory = new ForestMonsterFactory();
        Client forestGame = new Client(forestFactory);
        forestGame.startLevel();
    }
}

