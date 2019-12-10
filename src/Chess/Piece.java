package Chess;
import java.util.ArrayList;
/**
 * Chess Final Project 2019 Fall/Winter COSC3P71
 * @author Ethan Gibbons() 
 * @author Samantha Laffin(5017538)
 */
public abstract class Piece {    
    public char name;
    public Tile tile;
    public boolean firstMove;
    
    /**
     * Sets the tile of the current Piece
     * @param tile The tile to set the piece to.
     */
    public abstract void setTile(Tile tile);
    
    /**
     * Returns true if the current piece is a black piece.
     * @return True if the current piece is black.
     */
    public abstract boolean isBlack();
    
    /**
     * Returns a list of viable tiles a piece can move to.
     * @return List of legal moves.
     */
    public abstract ArrayList<Tile> getMoveList();
    
    /**
     * Returns true if the tile passed is a legal move for the piece.
     * @param newTile Tile to check.
     * @return Returns true if a legal move.
     */
    public abstract boolean legalMove(Tile newTile);
    
    /**
     * Moves the Piece to the new location if a legal move.
     * @param newTile The tile to move to.
     */
    public abstract void move(Tile newTile); 
        
}
