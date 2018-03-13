package simple;

import java.util.Scanner;

public class EvenOddBitWise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Scanner input=new Scanner(System.in);
      while(true){
	  System.out.print("Enter a number: ");
	
	  int a=input.nextInt();
	//input.close();
	
	  if ((a&1)==0) /// last bit 1 holei odd. as 1 er sathe AND operation 
		System.out.println(a+" is even");
	  else
		System.out.println(a+" a is odd ");
}


	}
	}

// 101
// 001
// 001
