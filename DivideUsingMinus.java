import java.util.Scanner;

public class DivideUsingMinus {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int dividend=input.nextInt();
		System.out.print("Enter divisor: ");
		int divisor=input.nextInt();
		input.close();
		
		int vagfol=0;
		while(dividend>=divisor)
			
		{
			dividend=dividend-divisor;
			vagfol++;
		}
       System.out.println("The quitient is: "+vagfol);
       System.out.println("The reminder is: "+dividend);
	}

}
