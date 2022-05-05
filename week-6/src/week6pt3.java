import java.util.*;

public class week6pt3 {
	public static void main(String[] args) {
		// Sale/Commission example
		Scanner sc = new Scanner(System.in);
		System.out.println("How much is the sale?");
		double sale = sc.nextDouble();
		// IF/ELSE Statement using System.out.printf for formatting numbers with commas & decimals
		if (sale <= 50000.00) {
			double commission = sale * 0.010;
			System.out.printf("Commission is : $%,.2f", commission);
		}
		else {
			double commission = sale * 0.020;
			System.out.printf("Commission is : $%,.2f", commission);
		}
		System.exit(0);
	}
}
