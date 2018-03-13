import java.util.Scanner;

import java.util.*;
public class MagicToy {
	public static void main(String[] args) {
		
	
		        Scanner in = new Scanner(System.in);
		        System.out.println("enter");
		        double meal_cost = in.nextDouble();
		        int tip_percent = in.nextInt();
		        int tax_percent = in.nextInt();
		        in.close();
		        double total;
		        total=(meal_cost*tip_percent)/100+(meal_cost*tax_percent)/100+meal_cost;
		       total=Math.round(total);
		        int a=(int)total;
		        System.out.printf("The total meal cost is totalCost %d dollars.",a);
		    
		
	}
}
