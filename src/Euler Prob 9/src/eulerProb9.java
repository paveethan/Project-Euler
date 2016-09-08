import java.io.*;

public class eulerProb9 {
	public static void main (String args[]){
		new eulerProb9();
	}
	
	public eulerProb9(){
		for (int i = 0; i < 1000; i++){
			for (int j = 0; j < 1000; j++){
				for (int k = 0; k < 1000; k++){
					if ((i+j+k) == 1000){
						if (((i*i) + (j*j)) == (k*k))
						{
							System.out.println(i+" "+" "+j+" "+k);
						}
					}
				}
			}
		}
	}
}