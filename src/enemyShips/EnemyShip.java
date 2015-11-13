package enemyShips;


public abstract class EnemyShip {

    protected String name;
    protected int damage;
    protected int heatPoints;

    public abstract void EnemyShip(String name);
    public abstract void shot();
    public abstract void takeDamage();
    public abstract void move();
}
