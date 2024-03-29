import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadingFile {
    public static void main (String[] args) {
        
        ArrayList<String> whichline = new ArrayList<String>();
        try (BufferedReader read = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = read.readLine()) != null) {
                whichline.add(line);
                // System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }

        // Allows user to choose which line to output via Scanner
        Scanner sc = new Scanner(System.in);
        
        // With JOptionPane
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 0-" + (whichline.size() - 1) + ": "));
        JOptionPane.showMessageDialog(null, whichline.get(num));
        
        // With Console
        // System.out.print("Enter a number between 0-" + (whichline.size() - 1) + ": ");
        // System.out.print(String.format("Enter a number between 0-%d: ", (whichline.size() - 1)));
        // System.out.println(whichline.get(sc.nextInt()));
        sc.close();
    }
}
