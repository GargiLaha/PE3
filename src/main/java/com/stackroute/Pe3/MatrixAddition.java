package com.stackroute.Pe3;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[])
    {
      int i,a,b,j,r,c;
      Scanner in = new Scanner(System.in);
      System.out.println("Input number of rows of matrix:");
      r = in.nextInt();
      System.out.println("Input number of columns of matrix:");
      c = in.nextInt();
      int m[][] = new int[r][c];
      int n[][] = new int[r][c];
      System.out.println("Input the elements of first matrix:");
      for(i = 0; i < r; i++)
      {
        for(j = 0; j < c; j++)
        {
          m[i][j] = in.nextInt();
        }
      }
      System.out.println("Input the elements of second matrix:");
      for(i = 0; i < r; i++)
      {
        for(j = 0; j < c; j++)
        {
          n[i][j] = in.nextInt();
        }
      }
      int s[][] = new int[r][c];
      for(a = 0; a < r; a++)
      {
        for(b = 0; b < c; b++)
        {
          s[a][b] = m[a][b] + n[a][b];
        }
      }
      System.out.println("Sum of the matrices:");
      for(a = 0; a < r; a++)
      {
        for(b = 0; b < c; b++)
        {
          System.out.print(s[a][b] + "\t");
        }
        System.out.println();
      }

    }
}
