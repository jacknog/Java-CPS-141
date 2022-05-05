import java.util.*;

public class week9 {
	public static void main(String[] args) {
		// String array with names
		String[] names = { "Elena", "Thomas", "Hamilton", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
				"Emily", "Daniel", "Aaron", "Kate" };
		// Integer array with values
		int[] balance = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317 };
		for (int i = 0; i < balance.length; i++) {
			// Checks if the integer array 'balance' has any values above 350
			if (balance[i] > 350)
				// If so, print the corresponding array name with their balance
				System.out.println(names[i] + " : " + balance[i]);
		}
	}
}