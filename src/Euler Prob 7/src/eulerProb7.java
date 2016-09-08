import java.io.*;
import java.util.Vector;

public class eulerProb7 {
	public static void main (String args[]){
		new eulerProb7();
	}
	
	public eulerProb7(){
		Vector<Long> vector = new Vector<>();
		long iterator = 1;
		boolean success = false;
		
		while (!success) {
			boolean prime = checkIfPrime(iterator);
			if (prime)
			{
				vector.addElement(iterator);
				if (vector.size() == 10001)
				{
					System.out.println(iterator);
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
