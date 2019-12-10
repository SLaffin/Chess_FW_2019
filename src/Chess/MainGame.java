package Chess;

import java.io.File;
import java.util.Scanner;

/**
 * Chess Project 2019 Fall/Winter COSC3P71
 * @author Ethan Gibbons() 
 * @author Samantha Laffin(5017538)
 */
public class MainGame {
    Scanner in;
    final String StandardBoard = "H:\\Program Files\\NetBeans 8.1\\NetBeans_Projects\\Chess_FW_2019\\src\\Chess\\Standard_Board.txt"; //hardcoded because lazy
    Board gameBoard;    // the main gameboard
    
    public MainGame(){
        in = new Scanner(System.in);        
        // setupBoard(StandardBoard); // random testing stuff
        // gameBoard.print();
        
        // HI ETHAN
        // the main program loop will actually go in the UI eventually,
        // it actually is INSIDE your buttonlistener
        // which makes sens ebc thats where the action happens
        // its commmon for that and its easier for you to access stuff
              
        // GAME LOOP FOR TESTING 
        //loop start
        //      if (player is human)
        //           prompt current player for move in console
        //           if theyre in check, force them to move that piece (dunno how yet)
        //           move if valid, else loop and ask again (move(A4, H4));
        //           print board after move
        //       if (player is AI)
        //          if theyre in check, force them to move that piece 
        //          do minimax on board
        //          do best move
        //          print board after move         
        //       switch players
        //loop end
    };   
    
    private boolean move(Tile fromTile, Tile toTile){
        // checks piece on fromTile if toTile is in valid moves
        // moves if so, and returns true
        return false;
    }
    
    private void setupBoard(String file){
        gameBoard = new Board();
        gameBoard.fillBoardFromFile(file);
        gameBoard.nameStandardTiles();
    };
    
    private int optionSelect(){
        System.out.print("1. Use Default Board.");
        System.out.print("\t2. Use Custom Board.");
        System.out.print("\t3. ");
        System.out.println("\t4. ");
        System.out.print("5. ");
        System.out.println("\t0. Quit");
        return in.nextInt();
    };
    
    public static void main(String[] args){MainGame m= new MainGame();};
}
