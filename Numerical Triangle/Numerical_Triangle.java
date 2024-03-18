// Created: 2024-03-17 03:46 PM

import java.util.Scanner;

public class Numerical_Triangle
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);

  System.out.println("---Numerical Triangle---");
  System.out.print("Enter a number: ");
  int num = in.nextInt();

  for(int i = 1; i <= num; i++)
  {
   String pyramid = i + " ";
   System.out.println(pyramid.repeat(i));
  }  
 }
}