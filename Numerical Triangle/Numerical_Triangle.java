// Created: 2024-03-17 03:46 PM

import java.util.Scanner;

public class Numerical_Triangle
{
 public static void main(String[] args)
 {
     
  System.out.println("---Numerical Triangle---");
  System.out.print("Enter a number: ");
  Scanner in = new Scanner(System.in);
  int num = in.nextInt();
  in.close();
  

  String pyramid = "";
  for(int i = 1; i <= num; i++)
  {
   if(num >= 10 && i < 10)
   {
    pyramid = "0" + i + " ";
    System.out.println(pyramid.repeat(i));
   }
   else
   {
    pyramid = i + " ";
    System.out.println(pyramid.repeat(i));
   }
  }  
 }
}