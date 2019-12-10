package Chess;
/**
 * Chess Final Project 2019 Fall/Winter COSC3P71
 * @author Ethan Gibbons() 
 * @author Samantha Laffin(5017538)
 */

/**
 * A Class representing a single Tile on the chess board. Contains a piece
 */
public class Tile {
    Piece piece;    // the piece on the tile
    String name;    // the name of the tile (like A4, H8, etc)
    int column;     // column
    int row;        // row
    
    public Tile(){
        System.out.println("Called empty default tile constructor"); // just for troubleshooting
    };
    
    /**
     * Creates a new tile and 
     * @param piece Piece on the tile.
     * @param row Row the tile is on, zero-based indexing.
     * @param column  Column the tile is on, zero-based indexing.
     */
    public Tile(Piece piece,int row, int column){
        this.piece = piece;     // maybe can pass null for this for empty tiles?
        this.row = row;         // 0-based
        this.column = column;   // 0-based
    };
    
    /**
     * Just have this for troubleshooting.
     */
    public void print(){
        System.out.println(" label is "+name);
        System.out.print(" piece is "+piece);
        System.out.print(" row is "+row);
        System.out.print(" column is "+column);
    };

    /**
     * Returns piece that is placed on the tile.
     * @return The piece on the tile, and null otherwise.
     */
    public Piece getPiece() {
        return piece;
    };

    /**
     * Returns the name of the tile.
     * @return The name of the tile.
     */
    public String getName() {
        return name;
    };

    /**
     * Returns the integer of the Column containing the Tile in 0-based indexing.
     * @return Int of the column.
     */
    public int getColumn() {
        return column;
    };
    
    /**
     * Returns the integer row containing the Tile in 0-based indexing.
     * @return Int of the row.
     */
    public int getRow() {
        return row;
    };

    /**
     * Places a piece 'on' the Tile. Will overwrite a piece.
     * @param piece Piece to place on the tile.
     */
   
    public void setPiece(Piece piece) {
        this.piece = piece;       
    };
    
    /**
     * Sets a tile to have no piece.
     */
    public void removePiece(){
        this.piece = null;
    };
    
    /**
     * Returns true if tile is empty.
     * @return 
     */
    public boolean isEmpty(){
        return (piece == null);
    };
    
    
    

}