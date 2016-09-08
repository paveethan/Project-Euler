import java.io.*;
import java.util.Vector;

public class eulerProb10 {
	public static void main (String args[]){
		new eulerProb10();
	}
	
	public eulerProb10(){
		Vector<Long> vector = new Vector<>();
		long iterator = 1;
		boolean success = false;
		
		while (!success) {
			boolean prime = checkIfPrime(iterator);
			if (prime)
			{
				vector.addElement(iterator);
				if (vector.size() == 2000001)
				{
					long tempSum = 0;
					for (int i = 0; i < 2000000; i++) {
						tempSum += vector.elementAt(i);
					}
					System.out.println(tempSum);
					success = true;
					break;
				}
			}
			iterator++;
		}
	}
	
	public boolean checkIfPrime(long n)
	{
	    if (n%2==0){
	    	return false;
	    }
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
