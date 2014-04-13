package euler;

/**
 * 
 * @author gogasca
 * Sum of a range list of Natural numbers
 */

public class Problem1 {

	static public void main(String [] args) {
		int LIMIT = 1000;
		int sumNaturalNumbers = 0;
		
		for(int naturalNumber = 0; naturalNumber< LIMIT;naturalNumber++) {
			if (naturalNumber%3 == 0 || naturalNumber%5 == 0) {
				sumNaturalNumbers += naturalNumber;
			}
		}
		System.out.println("Sum of Natural Numbers is: " + sumNaturalNumbers);
	}
}
