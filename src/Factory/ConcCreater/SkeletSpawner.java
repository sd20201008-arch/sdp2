package Factory.ConcCreater;
import Factory.*;
import Factory.ConcProd.Skelet;

public class SkeletSpawner extends EnemyCreater{
    @Override 
    public Enemy CreateEnemy(){
        return new Skelet();
    }

}