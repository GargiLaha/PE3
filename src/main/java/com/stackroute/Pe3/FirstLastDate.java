package com.stackroute.Pe3;

import java.text.*;
import java.util.*;

public class FirstLastDate {
  public void weekdate()
  {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    System.out.println();
    DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
    System.out.println("First Date of the week: " + df.format(c.getTime()));
    for (int i = 0; i <6; i++)
    {
      c.add(Calendar.DATE, 1);
    }
    System.out.println("Last Date of the week: " + df.format(c.getTime()));
    System.out.println();
  }
  public static void main(String []args)
  {
    FirstLastDate ob = new FirstLastDate();
    ob.weekdate();
  }
}
