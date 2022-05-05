// First usage of import for package "SCANNER"
import java.util.Scanner;

public class week5 {
	public static void main(String[] args) {
		// Declare 'sc' as new SCANNER to read what the user types in the console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// Prints the * (star) pattern
			System.out.print("*");
		}
	}
}