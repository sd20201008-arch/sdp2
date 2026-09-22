package AbsFactory.ConcFac;
import AbsFactory.AbsProd.*;
import AbsFactory.ConcProd.*;
import AbsFactory.*;

public class ForestMonsterFactory implements AbsFactory {
    @Override
    public Boss createBoss() {
        return new ForestBoss();
    }

    @Override
    public Minion createMinion() {
        return new ForestMinion();
    }
}
 
