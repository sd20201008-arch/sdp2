package Factory.ConcCreater;

import Factory.*;
import Factory.ConcProd.HobGoblin;

public class HobGoblinSpawner extends EnemyCreater{
    @Override 
    public Enemy CreateEnemy(){
        return new HobGoblin();    
    }
}