/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program tells the user the height of a foot board, given its length
 * and width
 *
 ****************************************************************************/

import java.util.Scanner;

public class FootBoardCalc {

    public static void main(String[] arg) {
        Scanner userInput = new Scanner(System.in);
        double length;
        double width;
        double height;
	int counter;

        length = 0.0;
        width = 0.0;
        counter = 0;

        // Makes sure length and width cannot be negative
        while (length <= 0.0 || width <= 0) {
	    
            if (counter != 0) {

                System.out.print("Invalid input! ");
            }

             System.out.print("Enter the length of the board foot (inches): ");
             length = userInput.nextDouble();

             System.out.print("Enter the width of the board foot (inches): ");
             width = userInput.nextDouble();
             counter += 1;
	}
	
        height = FootBoard(length, width);

        System.out.print("\nThe height of the board is " + height + " inches.");	
    }
	
    public static double FootBoard(double len, double wid) {
        
            double height;
            double VOLUME;

            // Calculates height
            VOLUME = 144.0;
            height = (VOLUME / len) / wid;
			
            return height;
    }
}
