

import java.util.Scanner;
 
class MultiplicationTable
{
   public static void main(String args[])
   {
      int n, c;
      n=12;
      System.out.println("Multiplication table of " + n + " is : ");
 
      for (c = 1; c <= 10; c++)
         System.out.println(n + "*" + c + " = " + (n*c));
   }
}
