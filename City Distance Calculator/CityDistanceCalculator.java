import java.util.ArrayList;
import java.util.Scanner;

public class CityDistanceCalculator
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city to travel from: ");
        String from = scanner.nextLine();
        System.out.print("Enter the city to travel to: ");
        String to = scanner.nextLine();
        scanner.close();

        ArrayList<String> fromCity = new ArrayList<String>();
        fromCity.add("Los Angeles");
        fromCity.add("San Francisco");
        fromCity.add("Portland");
        ArrayList<String> toCity = new ArrayList<String>();
        toCity.add("Seattle");
        toCity.add("Denver");
        toCity.add("Chicago");

        int[][] distance = {
            {1135, 1016, 2055},
            {807,1250,2128},
            {174,1240,2121}
        };

        System.out.printf("The distance is %d miles.\n" , distance[fromCity.indexOf(from)][toCity.indexOf(to)]);
    }
}