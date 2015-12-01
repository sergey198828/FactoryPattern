import enemyShips.*;


public class enemyShipsFactory {
    public EnemyShip createShip(String shipType)throws ClassNotFoundException{
        if(shipType.equals("R")) return new RocketShip();
        else if(shipType.equals("U")) return new UFO();
        else throw new ClassNotFoundException();
    }
}
