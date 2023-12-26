/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int n = (int) (Math.random() * 10);
		int old = -1; // so as that n will always be greater than old at the start.
		while (old <= n) {
			// Generates and prints random number in [0,10).
			System.out.print(n + " ");
			old = n;
			n = (int) (Math.random() * 10);
		}

/* //this is code that i wrote for myself to test the Do-While Loop.
	int n = (int) (Math.random() * 10);
		int old = -1; // so as that n will always be greater than old at the start.
		do {
			// Generates and prints random number in [0,10).
			System.out.print(n + " ");
			old = n;
			n = (int) (Math.random() * 10);
		} while (old <= n);
*/


	}

}
