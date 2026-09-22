package Factory;

public abstract class EnemyCreater{
    public abstract Enemy CreateEnemy();
    public void spawnAndAttack(){
        Enemy enemy = CreateEnemy();
        System.out.println("prepare to fight");
        enemy.attack();
    }

}