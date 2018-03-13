import java.util.Scanner;
import java.math.*;

public class FillSeries {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter t  ");
        int t=in.nextInt();
        int s=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int p=0;p<n;p++)
            {
           
              s=a+b*(int)(Math.pow(2,p));
           
              System.out.print(s+" ");
              a=s;
               
            }  
            System.out.print("\n");
        }
        in.close();
        
    
	}

}
