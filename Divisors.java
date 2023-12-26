/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		for (int i = 1; i <= x/2; i++)  {  //check all numbers up to i/2 for efficiency
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(x);
	}
}
