package enemyShips;


public class UFO extends EnemyShip {
    @Override
    public void EnemyShip(String name) {
        this.name=name;
        this.heatPoints=15;
        this.damage=3;
        System.out.println("UFO created");
    }

    @Override
    public void shot() {
        System.out.println("Shot a blaster");
    }

    @Override
    public void takeDamage() {
        System.out.println("UFO taking damage");
    }

    @Override
    public void move() {
        System.out.println("UFO moving");

    }
}
