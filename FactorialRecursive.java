package simple;

import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an number: ");
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	in.close();
	System.out.println(" Factorial of "+number +" is "+factorial(number));
	}
	public static int factorial(int num)
	{
		
		int answer;
		if (num==0 || num==1) {
		return 1;
		}else{
		answer = factorial(num-1) * num; //recursive calling
		}
		return (answer);
		}
}
