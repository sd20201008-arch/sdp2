package Factory.ConcCreater;
import Factory.*;
import Factory.ConcProd.Goblin;

public class GoblinSpawner extends EnemyCreater{
    @Override 
    public Enemy CreateEnemy(){
        return new Goblin();
    }

}