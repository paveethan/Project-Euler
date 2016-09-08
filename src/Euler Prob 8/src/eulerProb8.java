import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class eulerProb8 {
	public static void main (String args[]){
		new eulerProb8();
	}
	
	public eulerProb8(){
		Vector<Long> vector = new Vector<>();
		BufferedReader br = null;
		try {
			String curr;
			
			br = new BufferedReader(new FileReader("C:\\Users\\tamil\\Copy\\Personal Work\\Project Euler\\Euler Prob 8\\src\\input.txt"));
			
			while ((curr = br.readLine()) != null) {
				for (int j = 0; j < 50; j++) {
					String temp = "" +curr.charAt(j);
					int temp2 = Integer.parseInt(temp);
					long temp3 = temp2;
					vector.addElement(temp3);
					
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		int size = vector.size();
		System.out.println(size);
		long compare = 0;
		boolean dont = false;
		for (int k = 0; k < 988; k++){
			System.out.println(k);
			int x1 = k;
			int x2 = k + 1;
			int x3 = k + 2;
			int x4 = k + 3;
			int x5 = k + 4;
			int x6 = k + 5;
			int x7 = k + 6;
			int x8 = k + 7;
			int x9 = k + 8;
			int x10 = k + 9;
			int x11 = k + 10;
			int x12 = k + 11;
			int x13 = k + 12;
			
			if ((x1 > size) || (x2 > size) || (x3 > size) || (x4 > size) || (x5 > size) || (x6 > size) || 
			(x7 > size) || (x8 > size) || (x9 > size) || (x10 > size) || (x11 > size) || (x12 > size) ||  
			(x13 > size)) {
				dont = true;
				System.out.println("yo");
				break;
			}
			if (!dont)
			{
				long temp = vector.elementAt(x1) * vector.elementAt(x2) * vector.elementAt(x3) * vector.elementAt(x4)
						*vector.elementAt(x5) * vector.elementAt(x6) * vector.elementAt(x7) * vector.elementAt(x8)
						*vector.elementAt(x9) * vector.elementAt(x10) * vector.elementAt(x11) * vector.elementAt(x12)
						* vector.elementAt(x13);
				if (temp > compare)
					compare = temp;			
			}
		}
		System.out.println(compare);
	}
}
