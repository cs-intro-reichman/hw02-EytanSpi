/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				for(int j = 1; j <= n; j++) {
					System.out.print("* ");
				}
			} else {
				for(int j = 1; j <= n; j++) {
					System.out.print(" *");
				}	
			}
			System.out.println();
		}
	}
}
