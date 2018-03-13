import java.util.Scanner;
import java.io.*;

public class SumFileInput {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException{
		  Scanner s =new Scanner(new File("sample.txt"));
		  s.close();
//		  Scanner s2 = new Scanner(new File("sample2.txt"));
//	        int tmp1 = s.nextInt();
//	        int tmp2 = s2.nextInt();
//	        System.out.println(tmp1 + tmp2);

		  int sum=0;
		  while(s.hasNext())
		  {
			  sum +=s.nextInt();
		  }
		  System.out.println("sum is "+sum);
	}

}
