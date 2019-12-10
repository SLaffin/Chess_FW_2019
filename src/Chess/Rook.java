package Chess;
/**
 * Chess Final Project 2019 Fall/Winter COSC3P71
 * @author Ethan Gibbons() 
 * @author Samantha Laffin(5017538)
 */
import java.util.ArrayList;

public class Rook extends Piece{
    char name; // the name of the piece (p, K, r);
    Tile tile;
    boolean firstMove; //true if the piece has not yet moved.
    
    public Rook(char name){
        this.name = name;
        this.firstMove = true;
    }
    
    @Override
    public void setTile(Tile tile){
        this.tile = tile;
    }
    
    @Override
    public boolean isBlack(){
        return Character.isUpperCase(name);
    };
    /**
     * An arrayList containing all legal moves for this piece.
     * @return ArrayList of legal moves.
     */
    @Override
    public ArrayList<Tile> getMoveList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Returns true if the legal move list of a piece contains a tile.
     * @param tile
     * @return 
     */
    @Override
    public boolean legalMove(Tile tile){
        ArrayList<Tile> moveList = getMoveList();
        return(moveList.contains(tile));
    };

    
    @Override
    public void move(Tile newTile){
        // if legalmove, move
        // set firstmove to false after this move
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
