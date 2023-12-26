/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 1; //we will be skipping the number one in the loop (1 is not perfect and is a divisor for every number)
		String strPerfect = n + " is a perfect number since " + n + " = 1";
		for (int i = 2; i <= n/2 && sum <= n; i++) { //check all numbers up to i/2, with option to stop if sum is greater than n - for optimization
			if (n % i == 0) {
				sum += i;
				strPerfect = strPerfect + " + " + i;
			}
		}
		if (sum != n) {
			System.out.println(n + " is not a perfect number");
		}
		else {
			System.out.println(strPerfect);
		}

	}
}
