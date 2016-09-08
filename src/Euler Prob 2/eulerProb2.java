import java.io.*;
import java.math.*;

public class eulerProb2{
    public static void main (String args[]){
	int x = 0;
	int y = 1;
	int z = x + y;
	int sum = 0;
	
	while (z < 4000000){
	    if ((z%2)==0){
		sum += z;
	    }    
	}
    }
}
