package AbsFactory.ConcFac;
import AbsFactory.AbsFactory;
import AbsFactory.AbsProd.*;
import AbsFactory.ConcProd.*;

public class IceMonsterFactory implements AbsFactory {
    @Override 
    public Boss createBoss() {
        return new IceBoss();
    }
    @Override 
    public Minion createMinion() {
        return new IceMInion();
    }
}