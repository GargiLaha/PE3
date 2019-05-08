package com.stackroute.Pe3;

import java.util.Scanner;

public class PlaceVowel {
  public static void main(String args[])
  {
    int i,a,n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of places:");
    n = in.nextInt();
    String p[] = new String[n];
    System.out.println("Enter the name of the places:");
    for(i = 0; i < n; i++)
    {
      p[i] = in.nextLine();
    }
    for(i = 0; i < n; i++)
    {
      String s1 = "",s = p[i];
      int l = s.length();
      for(a = 0; a < l; a++)
      {
        char c = s.charAt(i);
        if((c == 'A')||(c == 'E')||(c == 'I')||(c == 'O')||(c == 'U')||(c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u'))
          continue;
        else
          s1 = s1 + c;
      }
      p[i] = s1;
    }
    for(i = 0; i < n; i ++)
    {
      System.out.println("Place Name without vowels: " + i + " " + p[i]);
    }
  }
}
