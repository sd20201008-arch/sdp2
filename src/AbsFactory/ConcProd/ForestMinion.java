package AbsFactory.ConcProd;
import AbsFactory.AbsProd.Minion;

public class ForestMinion implements Minion {
    @Override 
    public void patrol(){
        System.out.println("ForestMinion patrol");
    }

}