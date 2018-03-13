package simple;

import java.util.Scanner;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	     
		  System.out.print("Enter a number: ");
		
		  int a=input.nextInt();
		//input.close();
		  int count =0;
		for(int i=1; i<=a;i++)
		{
			if (a/i==0)
				count++;
		}
		
		  if (count>2) /// last bit 1 holei odd. as 1 er sathe AND operation 
			System.out.println(a+" is not prime");
		  else
			System.out.println(a+" a is prime");
	

	}

}


