package com.stackroute.Pe3;

public class ChessBoard {
  public void chessPattern()
  {
    int i, j;
    String cb[][]=new String[8][8];
    for(i=0;i<8;i++)
    {
      for(j=0; j<8; j++)
      {
        if((i%2)==(j%2))
          cb[i][j]="WW|";
        else
          cb[i][j]="BB|";
      }
    }
    System.out.println("My chess board");
    for(i=0;i<8;i++)
    {
      for(j=0;j<8;j++)
      {
        System.out.print(cb[i][j]);
      }
    System.out.println();
    }
  }

  public static void main(String[] args) {
    ChessBoard object= new ChessBoard();
    object.chessPattern();
  }
}
