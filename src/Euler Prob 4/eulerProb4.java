import java.io.*;
import java.lang.StringBuilder; 



public class eulerProb4{
    public static void main (String args[]){
	int sum = 0;
	int largestPalindrome = 0;
	
	for (int i = 100; i < 1000; i++){
	    for (int j = 100; j < 1000; j++){
		sum = i*j;
		int tempResult = checkIfPalindrome(sum, largestPalindrome);
		if (tempResult >= largestPalindrome){
			largestPalindrome = tempResult;
		}
	    }
	}
	System.out.println(largestPalindrome);
    }
    
    public static int checkIfPalindrome(int sum, int largestPalindrome){
	String tstSum = Integer.toString (sum);
	boolean tst = isPalindrome(tstSum);
	if ((tst) && (sum >= largestPalindrome)){
	    return sum;
	}
		return -1;
    }
    
    public static boolean isPalindrome(String str) {
	return str.equals(new StringBuilder(str).reverse().toString());
    }
}

