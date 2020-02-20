/*
 * Anton dela Cruz
 * February 19, 2020
 * This program compares the square of the square root of any number, with the difference in these values is due to the rounding error in Java.
 */
package roundingerror;

import javax.swing.*;
/**
 *
 * @author antde
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Please enter a number");
        int userInput = Integer.parseInt(input);
        double root = Math.sqrt(userInput);
        double sq = root * root; 
        
        System.out.println("The square of the square: " + sq);
        System.out.println("The round off error: " + (userInput - sq));
    }
    
}
