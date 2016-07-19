/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessrefurbished;

/**
 *
 * @author Threadcount
 */
public class Square {
    private static int sqrValue = 1;
    //private Piece pce;
    private String pce;
    private String cellNumber;
    private String chessBoardLocation;
    private String cellNumbers[][] = {
        {"1", "2", "3", "4", "5", "6", "7", "8"},
        {"9", "10", "11", "12", "13", "14", "15", "16"},
        {"17", "18", "19", "20", "21", "22", "23", "24"},
        {"25", "26", "27", "28", "29", "30", "31", "32"},
        {"33", "34", "35", "36", "37", "38", "39", "40"},
        {"41", "42", "43", "44", "45", "46", "47", "48"},
        {"49", "50", "51", "52", "53", "54", "55", "56"},
        {"57", "58", "59", "60", "61", "62", "63", "64"}};


    private String chessBoardLocations[][] = {
        {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
        {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
        {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
        {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
        {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
        {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
        {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
        {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}};
    
    public Square(){
        int row, column;
        this.pce = " ";
        row = (int)((sqrValue - 1)/8);
        column = (int)((sqrValue - 1)%8);
        this.cellNumber = cellNumbers[(sqrValue - 1)/8][(sqrValue - 1)%8];
        this.chessBoardLocation = chessBoardLocations[(sqrValue - 1)/8][(sqrValue - 1)%8];
        sqrValue++;
    }
    
    public String getCellNumber(){
        return this.cellNumber;
    }
    
    public String getLocation(){
        return this.chessBoardLocation;
    }
    
    public Square(Piece pce){
        this.pce = pce.toString();
        this.cellNumber = cellNumbers[(sqrValue - 1)/8][(sqrValue - 1)%8];
        this.chessBoardLocation = chessBoardLocations[(sqrValue - 1)/8][(sqrValue - 1)%8];
        sqrValue++;
    }
  
      
    public int getSqrVal(){
        return this.sqrValue;
    }
    
    
    public String getPiece(){
        return this.pce;
    }
     
    public void addPiece(Piece pce){
        this.pce = pce.toString();
    }
    
    public boolean equals(Object o){
        if(super.equals(o)){
            return true;
        }
        Square sqr = (Square)o;
        if((this.sqrValue == sqr.sqrValue) &&
           (this.cellNumber == sqr.cellNumber) &&
                (this.chessBoardLocation == sqr.chessBoardLocation) &&
                (this.pce == sqr.pce)){
            return true;
        }
         return false;       
    }
    
}
