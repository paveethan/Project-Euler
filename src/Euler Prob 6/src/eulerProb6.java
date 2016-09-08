import java.io.*;

public class eulerProb6 {
	public static void main (String args[]){
		new eulerProb6();
	}
	
	public eulerProb6(){
		int i = sumSquare();
		int j = squareSum();
		
		int x = j - i;
		System.out.println(x);
	}
	
	public int sumSquare (){
		int temp  = 0;
		for (int i = 1; i <= 100; i++)
		{
			temp += (i*i);
		}
		
		return temp;
	}
	
	public int squareSum (){
		int temp  = 0;
		for (int i = 1; i <= 100; i++)
		{
			temp += i;
		}
		temp = temp * temp;
		return temp;
	}
}
