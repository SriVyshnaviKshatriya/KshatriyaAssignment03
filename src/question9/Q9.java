/**
 * 
 */
package question9;

import java.util.Scanner;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Q9 {

	/**
	 * @param args
	 */
	
	public static int name(int n) {
		int a = 2;
		return a*5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			    // Execute code that uses the resources
			System.out.println("Enter num");
			int n1 = sc.nextInt();
			System.out.println(name(n1));

			} catch (ArithmeticException e1) {
			    System.out.println("Error "+e1);
			}

	}

}