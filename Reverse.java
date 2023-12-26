/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int l = s.length();
		for (int i = l - 1; 0 <= i ; i--) { // i marks place in the string
			System.out.print(s.charAt(i));
		}
		System.out.println();
		int mid = (l - 1) / 2; // for even lengthed Strings - mid will be the first out of the 2 centers
		System.out.println("The middle character is " + s.charAt(mid));
	}

}
