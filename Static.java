import java.util.Scanner;


public class Static {
	static boolean flag=true;
	static int B,H;
	
static{
	
	Scanner in=new Scanner(System.in);
	B=in.nextInt();
	H=in.nextInt();
	in.close();
	if(B>0 && H>0)
        flag=true;
    else
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }}
	public static void main(String[] args) {
		if(flag){
			int a=H*B;
			System.out.println(a);
		}
		
	}

}
