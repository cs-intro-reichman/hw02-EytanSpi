import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */

	//// In the previous version of this program, you used a statement like:
	//// double rnd = Math.random();
	//// Where "rnd" is the variable that stores the generated random value.
	//// In this version of the program, replace this statement with:
	//// double rnd = generator.nextDouble();
	//// This statement will generate a random value in the range [0,1),
	//// just like you had in the previous version, except that the 
	//// randomization will be based on the given seed.
	//// This is the only change that you have to do in the program.

public class OneOfEachStats {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  	
		int times = Integer.parseInt(args[0]);
		int totalChildren = 0, countFam2 = 0, countFam3 = 0, countFamMore = 0;
		for (int i = 1; i <= times; i++) {  //checks for each family and records the numbers
			boolean bothGenders = false;
			int firstGen = (int) (generator.nextDouble()*2); // 0-boy 1-girl
			int kids = 1;
			while (!bothGenders) {
				int gen = (int) (generator.nextDouble()*2); // 0-boy 1-girl
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
