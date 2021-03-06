import enemyShips.EnemyShip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        enemyShipsFactory factory = new enemyShipsFactory();
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption ="";
        System.out.println("Please choose ship type R/U?");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }
        try{
            EnemyShip a = factory.createShip(enemyShipOption);
            a.move();
            a.shot();
            a.takeDamage();
        }catch(ClassNotFoundException e){
            System.err.println("Only R or U is available");
            e.printStackTrace();
        }

    }
}
