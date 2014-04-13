package euler;
import java.util.ArrayList;
import java.util.List;


public class Problem3 {

	/**
	 * @param args
	 */
	
	 public static List<Integer> primeFactors(long number) {
		    long n = number;
		    List<Integer> factors = new ArrayList<Integer>();
		    for (int i = 2; i <= n; i++) {
		      while (n % i == 0) {
		        factors.add(i);
		        n /= i;
		      }  
		    }
		    return factors;
	 }
	 
	 public static List<Integer> primeFactorsOptimized(int numbers) {
		    int n = numbers;
		    List<Integer> factors = new ArrayList<Integer>();
		    for (int i = 2; i <= n / i; i++) {
		      while (n % i == 0) {
		        factors.add(i);
		        n /= i;
		      }
		    }
		    if (n > 1) {
		      factors.add(n);
		    }
		    return factors;
	 }
	 
	public static long largestPrimeFactor(long n) {

        // largest composite factor must be smaller than sqrt
        long sqrt = (long)Math.ceil(Math.sqrt((double)n));
        System.out.println("largestPrimeFactor()" + n + " sqrt: " + sqrt);
        long largest = -1;

        for(long i = 2; i <= sqrt; i++) {
            if(n % i == 0) {
                long test = largestPrimeFactor(n/i);
                if(test > largest) {
                    largest = test;
                }
            }
        }

        if(largest != -1) {
            return largest;
        }

        // number is prime
        return n;
    } 
	
	
	public static void main(String[] args) {
		
		System.out.println(largestPrimeFactor(600851475143L));
		System.out.println("Prime factors of 600851475143L");
	    for (Integer integer : primeFactors(600851475143L)) {
	      System.out.println(integer);
	    }
	}

}
