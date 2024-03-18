//Created: 2024-03-17

import java.util.Scanner;

public class Geometric_Sequence
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);

  System.out.println("---Geometric Sequence Calculator---");
  System.out.print("Enter 3 numbers: ");
  int num = 3; // number of integers

  double[] split = new double[num];  
  for(int i = 0; i < num; i++)
  {
   split[i] = input.nextDouble();
  }

  double currentMultiple = split[0];
  System.out.println("The common ratio is: " + (split[1] / split[0]));
  for(int i = 1; i < split[2]; i++)
  {
   System.out.println( "n" + i + " = " + currentMultiple + " ");
   double total = currentMultiple * (split[1] / split[0]);
   currentMultiple = total;
  }
  System.out.println("n" + (int)split[2] + " = " + currentMultiple);
 }
}