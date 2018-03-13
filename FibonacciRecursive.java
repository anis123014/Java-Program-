package simple;

public class FibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=7;
for(int i=0; i<=number;i++)
   {
	int fib= fibonacciRec(i);
	System.out.print(fib+" ");
	}

	}
	public static int fibonacciRec(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		{
			return fibonacciRec(n-2)+fibonacciRec(n-1);
			
		}
		
	}

}
