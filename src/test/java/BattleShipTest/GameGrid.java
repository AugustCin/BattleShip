package BattleShipTest;
import java.util.Scanner;


public class GameGrid extends AbstractGameGrid{
    GameGrid() {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        int n = input.nextInt();
        this.width = w;
        this.height = h;
        this.number = n;
    }

    public void generateShips(){
        GameGrid ship_n = new GameGrid();
        int arr = [ship_n.width][ship_n.height]; //不会

    }

}
