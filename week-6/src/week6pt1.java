import java.util.*;

public class week6pt1 {
	public static void main(String[] args) {
		// Code compares contents in 'y' to 0 and shows an outcome of 'y' if it equals or prints 'invalid'
		Scanner sc = new Scanner(System.in);
		int y = 100;
		System.out.println("Enter a number");
		int x = sc.nextInt();
		if (x == 0)
			System.out.println(y);
		else
			System.out.println("Invalid");
		System.exit(0);
	}
}