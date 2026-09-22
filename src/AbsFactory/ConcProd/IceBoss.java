package AbsFactory.ConcProd;
import AbsFactory.AbsProd.Boss;     

public class IceBoss implements Boss {
    @Override 
    public void specialAttack(){
        System.out.println("IceBoss special attack");
    }

}