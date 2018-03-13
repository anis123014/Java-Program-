import java.util.Scanner;

public class PrintFibonacci {
	public static void fibonacci(int n) {
		int a[]=new int[n+1];
		a[0]=0;
		a[1]=1;
		System.out.print(a[1]+" ");
		for(int i=2; i<=n;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.print(a[i]+" ");
		}
		

	}

	public static void main(String[] args) {
		System.out.println("Enter a number (n) ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		fibonacci(n);

	}

}
