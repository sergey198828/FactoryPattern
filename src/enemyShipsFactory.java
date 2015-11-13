import enemyShips.*;


public class enemyShipsFactory {
    public EnemyShip createShip(String shipType){
        EnemyShip resultedShip = null;
        if(shipType.equals("R")) resultedShip = new RocketShip();
        if(shipType.equals("U")) resultedShip = new UFO();
        return resultedShip;
    }
}
