import java.util.Scanner;

public class ArrayOperations
{
 public static void main(String[] args)
 {
  System.out.print("Enter a list of numbers: ");
  Scanner scanner = new Scanner(System.in);
  String input = scanner.nextLine();
  scanner.close();
  String[] items = input.split(" ");
  int[] num = new int[items.length];
  for(int i = 0; i < items.length; i++)
  {
   num[i] = Integer.parseInt(items[i]);
  }

  int sum = 0;
  int min = num[0];
  int max = num[0];
  for(int i = 0; i < num.length; i++)
  {
   if(num[i] > max)
   {
    max = num[i];
   }
   if(num[i] < min)
   {
    min = num[i];
   }
   System.out.print(num[i] + " ");
   sum += num[i];
  }

  System.out.println();
  System.out.println("Array Length: " + num.length);
  System.out.println("Maximum: " + max);
  System.out.println("Minimum: " + min);
  System.out.println("Sum of all numbers: " + sum);
 }
}
