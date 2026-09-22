package AbsFactory.ConcProd;
import AbsFactory.AbsProd.Minion;

public class IceMInion implements Minion {
    @Override 
    public void patrol(){
        System.out.println("IceMinion patrol");
    }

}