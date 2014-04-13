package euler;

public class Problem2 {

	/**
	 * @param args
	 */
	
	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

	public static void main(String[] args) {

		
		for (int i = 1; i <= 10; i++)
            System.out.println(i + ": " + fib(i));
		
	
		/*int LIMIT = 4000000;
		double newFibonacci = 0;
		double finalSum = 2;
		int index = 0;
		double number1 = 1;
		double number2 = 2;
		
		System.out.println("Fibonacci number: " + number1);
		System.out.println("Fibonacci number: " + number2);
		
		while(newFibonacci<LIMIT) {
			
			newFibonacci = number1 + number2;
			System.out.println("Fibonacci number: " + newFibonacci);
			if(newFibonacci % 2 == 0) {
				finalSum+=newFibonacci;
			}
			number1 = number2;
			number2 = newFibonacci;
		}
		
		System.out.println("Final Sum: " + finalSum);
		*/
	}

	
}
