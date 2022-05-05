import java.util.*;
public class week9pt2 {
	public static void main(String[] args) {
		// Program to display array of employees hours
		int m = 0;
		int[] hours = new int[3];
		Scanner sc = new Scanner(System.in);
		for (m = 0; m <= 2; m++) {
			System.out.println("Enter hours for employee " + m);
			hours[m] = sc.nextInt();
		}
		for (m = 0; m < hours.length; m++) {
			System.out.println("Employee " + m + " worked " + hours[m] + " hours");
		}
	}
}