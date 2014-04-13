package euler;
import java.util.ArrayList;


public class Problem5 {

	static ArrayList<Integer> MyArrayList=new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static boolean testNumber(int x){
		for(int i: MyArrayList){
			if(x % i != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void init() {
		for(int i=1;i<=20;i++) {
			MyArrayList.add(i);
		}
	}
	
	public static void main(String[] args) {
		
		init();
		boolean foundValue=true;
		int numberToEvaluate= 1;
		
		while(foundValue){
			if(testNumber(numberToEvaluate)) {
				foundValue=false;
				break;
			}
			numberToEvaluate++;
		}
		
		System.out.println("Number found: " + numberToEvaluate);

	}

}
