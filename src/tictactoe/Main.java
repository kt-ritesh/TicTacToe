package tictactoe;
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first player Name : ");
        Player A = new Player();
        A.setName(sc.nextLine());
        A.setSymbol('0');
        System.out.println("Your Sysmbol is "+ A.getSymbol());

        System.out.println("Enter the second player Name : ");
        Player B = new Player();
        B.setName(sc.nextLine());
        B.setSymbol('X');
        System.out.println("Your Sysmbol is "+ B.getSymbol());

        Player [] players = {A,B};

        Board board = new Board(3);
        Game game = new Game(players, board);
       
        game.play();
    }
}