package Task9;

import java.util.Scanner;

public class PrintingStars {

	public static void main(String args[]) {

		int i, j, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value for n");

		n = sc.nextInt(); //Using Scanner to get user input for number of rows

		// Upper V pattern

		for (i = n; i >= 1; i--) {

			for (j = i; j < n; j++) {

				System.out.print(" ");// print spaces

			}

			for (j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1))// printing star

					System.out.print("*");

				else

					System.out.print(" ");// if logic fails print space

			}

			System.out.println("");

		}

		// Lower Inverted V pattern

		for (i = 2; i <= n; i++) {

			for (j = i; j < n; j++) {

				System.out.print(" ");// Print spaces

			}

			for (j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1))// printing star

					System.out.print("*");

				else

					System.out.print(" ");// if logic fails print space

			}

			System.out.println("");

		}

	}

}
