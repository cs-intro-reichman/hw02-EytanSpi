
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean bothGenders = false;
		int firstGen = (int) (Math.random()*2); // 0-boy 1-girl
		int count = 1;
		if (firstGen == 0) {
			System.out.print("b");
		} else {
			System.out.print("g");
		}
		while (!bothGenders) {
			int gen = (int) (Math.random()*2); // 0-boy 1-girl
			count++;
			bothGenders = (firstGen != gen);
			if (gen == 0) {
				System.out.print(" b");
			} else {
				System.out.print(" g");
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
