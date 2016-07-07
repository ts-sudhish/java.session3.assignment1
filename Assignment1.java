/**
 * 
 */
package sdh.java.session3;

import java.util.Scanner;

/**
 * @author Sudhish TS
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("Enter the number whose square root and cube root is to be found: ");
		int number = Integer.parseInt(in.nextLine());
		System.out.println("The square root of " + number + " is: " + Math.sqrt(number));
		System.out.println("The cube root of " + number + " is: " + Math.cbrt(number));
	}
}