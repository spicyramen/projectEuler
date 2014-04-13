package euler;
import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {
	
	private static boolean isPalindrome(String s){
		for(int i=0 ; i < s.length()/2;i++)
		{
		  if(s.charAt(i) != s.charAt(s.length()-1-i))
			  return false;
		}

		return true;
	}
	


	public static void main(String[] args){
		
		ArrayList<Integer> MyArrayList=new ArrayList<Integer>();
		
		for (int x=100;x<=999;x++){
			for(int y =100;y<=999;y++) {
				int i = x*y;
				String strI = String.valueOf(i);
				if(isPalindrome(strI)){
					System.out.println("Number (" + i + ") | " + x + " | " +  y);
					MyArrayList.add(i);
				}	
			}
		
		}
		Collections.sort(MyArrayList);
		for(int j=0;j<MyArrayList.size();j++)
        {
            System.out.println(MyArrayList.get(j));
        }
		System.out.println("The largest Number is:");
        System.out.println(MyArrayList.get(-1+MyArrayList.size()));
		
	}
}
