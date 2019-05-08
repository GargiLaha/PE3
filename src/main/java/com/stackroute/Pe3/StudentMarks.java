package com.stackroute.Pe3;

import java.util.Scanner;

public class StudentMarks {

    public void input()
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of students:");
      int numOfStudents = in.nextInt();
      int stuGrades[] = new int[numOfStudents];
      for(int i = 0; numOfStudents > i; i++)
      {
        System.out.println("Enter the grade of student " + (i+1) + ":");
        int grade = in.nextInt();
        stuGrades[i] = grade;
        while((stuGrades[i] < 0) || (stuGrades[i] > 100))
        {
          System.out.println("Invalid input, grade must be between 0 and 100, re-enter grade:");
          stuGrades[i] = in.nextInt();
        }
      }
      for(int i = 0; i < numOfStudents; i++)
      {
        System.out.println("Grade of student " + (i+1) + ": " + stuGrades[i]);
      }
    }

    public static void main(String args[])
    {
      StudentMarks obj = new StudentMarks();
      obj.input();
    }
  }
