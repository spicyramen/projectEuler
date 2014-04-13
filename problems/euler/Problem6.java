package euler;

public class Problem6 {

	/**
	 * @param args
	 */
	public static long sumOfSquares(int limit){
		int SUM = 0;
		int SQUARE = 0;
		for(int i=1;i<=limit;i++) {
			SQUARE = i*i;
			SUM += SQUARE;
			//System.out.println(" i:" + i + " - sum: " + SUM + " - square: " + SQUARE);
		}

		return SUM;
	}
	
	public static long squareOfSum(int limit){
		int SUM = 0;
		for(int i=1;i<=limit;i++) {
			SUM+=i;
		}
		return SUM*SUM;
	}
	
	public static void main(String[] args) {
		//long result = squareOfSum(100) - sumOfSquares(100);
		int N = 100;
		long sOs = N*(N*2)/2;
		long sFn = N*(N+1)*(2*N+1)/6;
		System.out.println(sFn-sOs);
	}
}
