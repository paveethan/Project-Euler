import java.io.*;

public class eulerProb5 {
	public static void main (String args[]){
		new eulerProb5();
	}
	
	public eulerProb5(){
		int i = 20;
		int keepCount = 0;
		boolean success = false;
		int finalNum = 0;
		
		while (!success) {
			for (int j = 1; j <= 20; j++) {
				if ((i % j) == 0) {
					keepCount++;
				}
			}
			if (keepCount == 20)
			{
				success = true;
				finalNum = i;
				System.out.println(i);
				break;
			}
			else {
				keepCount = 0;
				i++;
			}
		}
	}

}
