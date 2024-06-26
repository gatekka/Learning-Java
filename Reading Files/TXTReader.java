import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TXTReader {
    public static void main (String[] args) {
        String path = "input.txt"; // File Path

        ArrayList<String> whichline = new ArrayList<String>();
        try (BufferedReader read = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = read.readLine()) != null) {
                whichline.add(line);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Please create file " + "\"" + path + "\"", "File not found", 0);
            e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Allows user to choose which line to output via Scanner
        Scanner sc = new Scanner(System.in);
        
        // With JOptionPane
        boolean success = false;
        while (!success) {
            String num = (JOptionPane.showInputDialog(null, "Enter the number of the line you'd like to read between 1-" + (whichline.size()) + ": ", null, 3));
            if (num == null) {
                break;
            }
            try {
                JOptionPane.showMessageDialog(null, whichline.get(Integer.parseInt(num) - 1), "Line " + num, 1);
                success = true;
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Please choose a number between 1-" + (whichline.size()), "Error", 0);
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        // With Console
        // System.out.print("Enter a number between 0-" + (whichline.size() - 1) + ": ");
        // System.out.print(String.format("Enter a number between 0-%d: ", (whichline.size() - 1))); // using string.format
        // System.out.println(whichline.get(sc.nextInt()));
        sc.close();
    }
}