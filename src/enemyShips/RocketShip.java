package enemyShips;

public class RocketShip extends EnemyShip {
    @Override
    public void EnemyShip(String name) {
        this.name=name;
        this.heatPoints=10;
        this.damage=5;
        System.out.println("Rocket ship created");
    }

    @Override
    public void shot() {
        System.out.println("Shot a rocket");
    }

    @Override
    public void takeDamage() {
        System.out.println("Rocket taking damage");
    }

    @Override
    public void move() {
        System.out.println("Rocket moving");

    }
}
