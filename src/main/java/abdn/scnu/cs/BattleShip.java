package abdn.scnu.cs;

import java.util.Random;
import java.util.Scanner;

public class BattleShip extends AbstractBattleShip {
    BattleShip(String ShipName) {
        String shipOrientation;
        Scanner input = new Scanner(System.in);
        super.name = input.next();

        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < 10; i++) {
            BattleShip ship = new BattleShip("Ships" +i);
            if (ship.getShipOrientation() == "horozontal") {
                horizontal++;
            } else if (ship.getShipOrientation() == "vertical") {
                vertical++;
            }
        }

    }
    public boolean checkAttack(int X, int Y){
        return false;
    }






    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getHits() {
        return 0;
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
    public void setHits(int numberOfHits) {

    }

    @Override
    public void sethits() {

    }

    @Override
    public int[][] getShipCoordinates() {
        return null;
    }

    @Override
    public void setShipCoordinates(int[][] coordinates) {

    }

    @Override
    public void setShipCoordinates() {

    }
}
