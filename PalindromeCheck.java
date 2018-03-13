package IT_Job;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner input=new Scanner(System.in);
//		String takeInput=input.nextLine();
//		input.close();
//		
//	    String s="";
//	    for(int i=takeInput.length()-1;i>=0;i--) {
//		  s=s+takeInput.charAt(i);
//		  }
// 
//	    if(takeInput.equals(s))
		int takeInput1=input.nextInt();
		input.close();
		String takeinput=Integer.toString(takeInput1);
		  String s="";
	     int l= takeinput.length();
	     
	     for(int i=l-1;i>=0;i--) {
			  s=s+takeinput.charAt(i);
			  }
	    if(takeinput.equals(s))
	    	System.out.println("palindrome");
	    else
	    	System.out.println("not palindrome");
	     
}
	}
