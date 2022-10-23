package BattleShipTest;

import java.util.Random;
import java.util.Scanner;

public class BattleShip implements AbstractBS{
    BattleShip(){
        String shipOrientation;
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int horizontal = 0;
        int vertical = 0;
        BattleShip ship = new BattleShip();
        for(int i = 0; i<10; i++){
            if (ship.getShipOrientation() == "horozontal") {
                horizontal++;
            } else if (ship.getShipOrientation() == "vertical") {
                vertical++;
            }
        }


    public void checkAttack(int X,int Y){
        return;
    }

    }




    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getHits() {
        return null;
    }

    @Override
    public String getShipOrientation() {
        Random random = new Random();
        int ori = random.nextInt(1);
        if (ori == 0)
            return "horizontal";
        else
            return "vertical";

    }

    @Override
    public void sethits() {

    }

    @Override
    public String getShipCoordinates() {
        return null;
    }

    @Override
    public void setShipCoordinates() {

    }
}
