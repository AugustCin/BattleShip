package BattleShipTest;

import java.util.Random;
import java.util.Scanner;

public class BattleShip extends AbstractBattleShip{
    constructor(){
        String shipOrientation;
        Scanner input = new Scanner;
        String name = input();
        Random random = new Random();
        int x = random.nextInt(4);
        int y = random.nextInt(4);
        int ori = random.nextInt(1);
        if (ori == 0)
            shipOrientation = horizontal;
        else
            shipOrientation = vertical;

    }
}
