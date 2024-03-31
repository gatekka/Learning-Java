import java.util.Scanner;

public class ExamplesOfMultiDimensionalArrays
{
    public static void main(String[] args)
    {
        System.out.print("Choose a method 1-3: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        switch (input)
        {
            case 1:
                method1();
                break;
            case 2:
                method2();
                break;
            case 3:
                method3();
                break;
            default:
                System.out.println("Invalid Input.");
        }
        
    }

    public static void printloop(int array[][][])
    {
        
        for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j<array[i].length; j++)
            {
                System.out.print(String.format("\t[%o][%o]: " , i, j));
                for (int k = 0; k<array[i][j].length; k++)
                {
                    array[i][j][k] = (int)(Math.random()*10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void method1()
    {

        // Method 1
        System.out.println("\nMethod 1: Three Dimensional Array\n");
        int array[][][] = new int[5][3][8];

        printloop(array);
        
    }
    
    public static void method2()
    {

        // Method 2
        System.out.println("\nMethod 2: Three Dimensional Jagged Array\n");
        int array[][][] = 
        {
            {{0,0,0},{0,0,0}},
            {{0,0,0},{0,0,0,0,0},{0,0,0}},
            {{0,0}}
        };

        printloop(array);
        
    }

    public static void method3()
    {

        // Method 3
        System.out.println("\nMethod 3: Another Three Dimensional Jagged Array\n");
        int array[][][] = new int[3][][];
        array[0] = new int[2][3];
        array[1] = new int[3][3];
        array[1][1] = new int[5];
        array[2] = new int[1][2];

        printloop(array);

    }
}