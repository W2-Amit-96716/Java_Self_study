package Patterns;
import java.util.Scanner;
public class PascalsTriangle {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the number of rows for Pascal's Triangle: ");
		        int numRows = input.nextInt();
		        input.close();

		        for (int i = 0; i < numRows; i++) {
		            // Print leading spaces for alignment (optional, for a pyramid shape)
		            for (int k = 0; k < numRows - i; k++) {
		                System.out.print(" ");
		            }

		            int number = 1; // First element of each row is always 1
		            for (int j = 0; j <= i; j++) {
		                System.out.print(number + " ");
		                // Calculate the next number in the same row using the formula
		                // number = number * (i - j) / (j + 1)
		                number = number * (i - j) / (j + 1);
		            }
		            // Move to the next line after printing a row
		            System.out.println();
		        }
		    }
		

	}


