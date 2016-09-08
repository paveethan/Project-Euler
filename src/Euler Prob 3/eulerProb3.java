import java.io.*;
import java.math.*;

public class eulerProb3{
    public static void main (String args[]){
	long x = 600851475143L;
	long largestPrime = 1;
	long tempIterator = 0;
	
	while (largestPrime < x)
	{
	    tempIterator++;
	    checkifPrime(tempIterator);
	    
	}
    }
    
    public static void checkifPrime (long temp){
	//a^p - a = pn where n is some integer, if p is prime
	long y = 600851475143L;
	BigInteger result = BigInteger.valueOf(2);
	BigInteger result2 = result.pow (temp);
    }
}
