package Chess;
/**
 * Chess Final Project 2019 Fall/Winter COSC3P71
 * @author Ethan Gibbons() 
 * @author Samantha Laffin(5017538)
 */
import java.io.*;
import java.util.*;

public class Board {
    Tile[][] board;
    Scanner in;
    
    public Board(){
        board = new Tile[8][8];
    };
    
    /**
     * Returns true if there's a checkmate condition.
     * @return 
     */
    private boolean checkMate(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    /**
     * Adds the selected piece to the specified tile on the board.
     * Zero-based indexing.
     */
    private void placePieceArray(Piece piece, int row, int column){
            board[row][column].setPiece(piece);       
    };
        
    /**
     * Adds the selected piece to the specified unoccupied tile on the board by traditional chess tile notation.
     * @param piece
     * @param tile 
     */
    private void placePieceTileName(Piece piece, String tileName){
        //A column, placing top to bottom
        if (tileName.equals("A8")) board[0][0].setPiece(piece); 
        if (tileName.equals("A7")) board[1][0].setPiece(piece);
        if (tileName.equals("A6")) board[2][0].setPiece(piece);
        if (tileName.equals("A5")) board[3][0].setPiece(piece);
        if (tileName.equals("A4")) board[4][0].setPiece(piece);
        if (tileName.equals("A3")) board[5][0].setPiece(piece);
        if (tileName.equals("A2")) board[6][0].setPiece(piece);
        if (tileName.equals("A1")) board[7][0].setPiece(piece);
        //B column, placing top to bottom
        if (tileName.equals("B8")) board[0][1].setPiece(piece);
        if (tileName.equals("B7")) board[1][1].setPiece(piece);
        if (tileName.equals("B6")) board[2][1].setPiece(piece);
        if (tileName.equals("B5")) board[3][1].setPiece(piece);
        if (tileName.equals("B4")) board[4][1].setPiece(piece);
        if (tileName.equals("B3")) board[5][1].setPiece(piece);
        if (tileName.equals("B2")) board[6][1].setPiece(piece);
        if (tileName.equals("B1")) board[7][1].setPiece(piece);
        //C column, placing top to bottom
        if (tileName.equals("C8")) board[0][2].setPiece(piece); 
        if (tileName.equals("C7")) board[1][2].setPiece(piece);
        if (tileName.equals("C6")) board[2][2].setPiece(piece);
        if (tileName.equals("C5")) board[3][2].setPiece(piece);
        if (tileName.equals("C4")) board[4][2].setPiece(piece);
        if (tileName.equals("C3")) board[5][2].setPiece(piece);
        if (tileName.equals("C2")) board[6][2].setPiece(piece);
        if (tileName.equals("C1")) board[7][2].setPiece(piece); 
        //D column, placing top to bottom
        if (tileName.equals("D8")) board[0][3].setPiece(piece); 
        if (tileName.equals("D7")) board[1][3].setPiece(piece);
        if (tileName.equals("D6")) board[2][3].setPiece(piece);
        if (tileName.equals("D5")) board[3][3].setPiece(piece); 
        if (tileName.equals("D4")) board[4][3].setPiece(piece); 
        if (tileName.equals("D3")) board[5][3].setPiece(piece); 
        if (tileName.equals("D2")) board[6][3].setPiece(piece); 
        if (tileName.equals("D1")) board[7][3].setPiece(piece);
        //E column, placing top to bottom
        if (tileName.equals("E8")) board[0][4].setPiece(piece); 
        if (tileName.equals("E7")) board[1][4].setPiece(piece); 
        if (tileName.equals("E6")) board[2][4].setPiece(piece);
        if (tileName.equals("E5")) board[3][4].setPiece(piece);
        if (tileName.equals("E4")) board[4][4].setPiece(piece); 
        if (tileName.equals("E3")) board[5][4].setPiece(piece);
        if (tileName.equals("E2")) board[6][4].setPiece(piece);
        if (tileName.equals("E1")) board[7][4].setPiece(piece); 
        //F column, placing top to bottom
        if (tileName.equals("F8")) board[0][5].setPiece(piece);
        if (tileName.equals("F7")) board[1][5].setPiece(piece); 
        if (tileName.equals("F6")) board[2][5].setPiece(piece); 
        if (tileName.equals("F5")) board[3][5].setPiece(piece); 
        if (tileName.equals("F4")) board[4][5].setPiece(piece); 
        if (tileName.equals("F3")) board[5][5].setPiece(piece);
        if (tileName.equals("F2")) board[6][5].setPiece(piece);
        if (tileName.equals("F1")) board[7][5].setPiece(piece);
        //G column, placing top to bottom
        if (tileName.equals("G8")) board[0][6].setPiece(piece);
        if (tileName.equals("G7")) board[1][6].setPiece(piece); 
        if (tileName.equals("G6")) board[2][6].setPiece(piece);
        if (tileName.equals("G5")) board[3][6].setPiece(piece);
        if (tileName.equals("G4")) board[4][6].setPiece(piece);
        if (tileName.equals("G3")) board[5][6].setPiece(piece);
        if (tileName.equals("G2")) board[6][6].setPiece(piece); 
        if (tileName.equals("G1")) board[7][6].setPiece(piece); 
        //H column, placing top to bottom
        if (tileName.equals("H8")) board[0][7].setPiece(piece);
        if (tileName.equals("H7")) board[1][7].setPiece(piece);
        if (tileName.equals("H6")) board[2][7].setPiece(piece); 
        if (tileName.equals("H5")) board[3][7].setPiece(piece); 
        if (tileName.equals("H4")) board[4][7].setPiece(piece); 
        if (tileName.equals("H3")) board[5][7].setPiece(piece); 
        if (tileName.equals("H2")) board[6][7].setPiece(piece); 
        if (tileName.equals("H1")) board[7][7].setPiece(piece);       
    }
    
    /**
     * Check to see is a tile on the chess board is occupied. IS THIS REDUNDANT     * 
     */
    private boolean tileEmpty(String tileName){
        return tileName.isEmpty();
    };
    
    /**
     * Initializes the board from a text file. 
     */
    void fillBoardFromFile(String file){        
        try (FileReader in = new FileReader(file)){ //try with resources
            int data = in.read();
            for (int i = 0; i < 8; i++){ //always standard board size
                for (int j = 0; j < 8; j++){
                    char pieceName = (char)data;                    // will read the letter from the file
                    //System.out.println("piecename is "+pieceName); 
                    Piece piece = createPiece(pieceName);           // create a piece coresponding to tilename                   
                    Tile tile = new Tile(piece,i,j);                // makes a new tile with the piec eon it
                    piece.setTile(tile);                            // sets the tile to the piece
                    board[i][j] = tile;                             // places that tile on the board
                    data = in.read();                               //get next piece
                }
            }
        } catch (FileNotFoundException e){ 
            System.out.println("File path is not valid. Please fix filepath in MainGame.");
        } catch (IOException e){
            System.out.println("IOException in BoardFill.");
        }       
    };    
    
    /**
     * Was working on this, very busted. Probably not how pieces and and implementations of pieces works
     * @param name
     * @return 
     */
    Piece createPiece(char name){
        Piece result = null;
        switch(name){            
            case 'P': result = new Pawn(name); break;
            case 'R': result = new Rook(name); break;
            case 'N': result = new Knight(name); break;
            case 'B': result = new Bishop(name); break;
            case 'Q': result = new Queen(name); break;
            case 'K': result = new King(name); break;
            case 'p': result = new Pawn(name); break;
            case 'r': result = new Rook(name); break;
            case 'n': result = new Knight(name); break;
            case 'b': result = new Bishop(name); break;
            case 'q': result = new Queen(name); break;
            case 'k': result = new King(name); break; 
            case '-': break; // need a different solution to using null for no piece on tile prolly
        }
        return result;
    }
    
    /**
     * Names tiles in a board as a standard chessboard.
     */
    void nameStandardTiles(){        
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                String name;
                switch(j){
                    case 0: name = "A"+String.valueOf(8-i);
                    board[i][j].name = name;
                    break;
                    case 1: name = "B"+String.valueOf(8-i);  
                    board[i][j].name = name;
                    break;
                    case 2: name = "C"+String.valueOf(8-i); 
                    board[i][j].name = name;
                    break;
                    case 3: name = "D"+String.valueOf(8-i); 
                    board[i][j].name = name;
                    break;
                    case 4: name = "E"+String.valueOf(8-i);  
                    board[i][j].name = name;
                    break;
                    case 5: name = "F"+String.valueOf(8-i); 
                    board[i][j].name = name;
                    break;
                    case 6: name = "G"+String.valueOf(8-i); 
                    board[i][j].name = name;
                    break;
                    case 7: name = "H"+String.valueOf(8-i);  
                    board[i][j].name = name;
                    break;
                }
            }
        }        
    }
    
    /**
     * prints the gameboard to console.
     */
    void print(){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                System.out.print(" "+board[i][j].piece.name);
            }
            System.out.println();
        }
    }
   
    
}
