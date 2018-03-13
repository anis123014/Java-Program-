import java.util.Scanner;


public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a line:");
		String s=str.nextLine();
		str.close();
		System.out.println("String: "+s);
		System.out.println("reverse string: ");
		String rs []=s.split(" ");
		//System.out.println(rs.length);
		for(int i=rs.length-1;i>=0; i--)
		{
			System.out.print(rs[i]+" ");
		}
		System.out.println("\n\n");
		String rs1 []=s.split("");
		//System.out.println(rs.length);
		for(int i=rs1.length-1;i>=0; i--)
		{
			System.out.print(rs1[i]);
		}
	}

}
