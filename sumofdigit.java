import java.util.Scanner;


public class sumofdigit {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		
		String s=String.valueOf(n);
		String ns="";
		
		for(int j=0;j<k;j++){
		ns+=s;
		}
		int num=Integer.parseInt(ns);
		if (num<10)
		{
			System.out.println(num);
		}
		else{
		while(num>=10){
	        int sum = 0;
	        while(num!=0){
	            sum += num%10;
	            num /= 10;
	        }   
	        num = sum;
	    }
		}
		System.out.println(num);
		}
	
}
