import java.io.*;
import java.util.*;

public class ReadTheSpaceOfLine {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from standard input (System.in)
        Scanner sc = new Scanner(System.in);

        // Step 2: Initialize a variable to keep track of the line numbers
        int lineNumber = 0;

        // Step 3: Use a while loop to read input until there is no more input (EOF)
        while (sc.hasNext()) {
            // Step 4: Read the next line of input using Scanner's nextLine() method
            String line = sc.nextLine();

            // Step 5: Print the current line number and the content of the line
            System.out.println(lineNumber + " " + line);

            // Step 6: Increment the line number for the next iteration
            lineNumber++;
        }

        // Step 7: Close the Scanner object to release resources (optional but good practice)
        sc.close();
    }
}
