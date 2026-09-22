package AbsFactory.ConcProd;
import AbsFactory.AbsProd.Boss;

public class ForestBoss implements Boss {
    @Override 
    public void specialAttack(){
        System.out.println("ForestBoss special attack");
    }

}