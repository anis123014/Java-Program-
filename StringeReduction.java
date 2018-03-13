import java.util.ArrayList;
import java.util.Scanner;


public class StringeReduction {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner st=new Scanner(System.in);
		String s=st.nextLine();
		st.close();
		ArrayList<Character> al=new ArrayList<>();
		StringBuffer sb=new StringBuffer();
			
		for(int i=0; i<=s.length()-1;i++)
		{
			Character ch=s.charAt(i);
		if(!al.contains(ch))
		{
			al.add(ch);
			sb.append(ch);
		}
		
		}
System.out.println(sb.toString());
	}
		
	}


