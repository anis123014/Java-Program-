import java.util.Scanner;


public class FibonacciCheck {
	public static void main(String[] args) {
		//int firstNumber=0,	 secondNumber=1, fibonacciNumber=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number which to be checked: ");
		int fcheck=input.nextInt();
		input.close();
		fibonacci(fcheck);
		
	}
	public static void fibonacci(int fcheck)
	{
		int firstNumber=0,	 secondNumber=1, fibonacciNumber=0;
		
        while(fibonacciNumber<fcheck)
		{
		    fibonacciNumber=firstNumber+secondNumber;
		    firstNumber=secondNumber;
		    secondNumber=fibonacciNumber; 
		    //System.out.print(fibonacciNumber+" "); //this will print fibonaccci series
		  
		}
		if(fcheck==fibonacciNumber)
		{
			System.out.println("It is in fibonacci series");	
		}
		else
		{
			System.out.println("it is not in fibonacci series");
		}
	}
}
