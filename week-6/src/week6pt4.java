import java.util.*;

public class week6pt4 {
	public static void Swap(int m, int n) {
		// Swap method using a third variable to store number during switch
		int temp = m;
		m = n;
		n = temp;
		System.out.println(m + " " + n);
	}
	public static void main(String[] args) {
		int m = 9, n = 5;
		// Calls method Swap to main
		Swap(m, n);
	}
}