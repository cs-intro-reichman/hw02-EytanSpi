/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int times = Integer.parseInt(args[0]);
		int totalChildren = 0, countFam2 = 0, countFam3 = 0, countFamMore = 0;
		for (int i = 1; i <= times; i++) {  //checks for each family and records the numbers
			boolean bothGenders = false;
			int firstGen = (int) (Math.random()*2); // 0-boy 1-girl
			int kids = 1;
			while (!bothGenders) {
				int gen = (int) (Math.random()*2); // 0-boy 1-girl
				kids++;
				bothGenders = (firstGen != gen);
			}
			switch (kids) {
				case 2 :
					countFam2++;
					break;
				case 3 : 
					countFam3++;
					break;
				default : 
					countFamMore++;
					break;
			}
			totalChildren += kids;
		}
		double average = (double) totalChildren / times;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + countFam2);
		System.out.println("Number of families with 3 children: " + countFam3);
		System.out.println("Number of families with 4 or more children: " + countFamMore);
		String s = "";
		int mostCommon = Math.max(Math.max(countFam2, countFam3), countFamMore);
		if (mostCommon == countFam2) {
			s = "2.";
		} else if (mostCommon == countFam3) {
			s = "3.";
			} else {
				s = "4 or more.";
			}
		System.out.println("The most common number of children is " + s);
	}
}
