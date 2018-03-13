
public class FindSecondHighest {

	public static void main(String[] args) {
	secondHighest();
	}
	
	public static void secondHighest() {
		int array[]= {-3,12,4,67,54,32,69,3};
		
		int f_highest=0;
		int s_highest=0;
		for(int i:array)
		{
			if(i>f_highest)
			{
			   s_highest=f_highest;
			   f_highest=i;
			}
			else if(i>s_highest)
			{
				s_highest=i;
			}
		
		}
		System.out.println(s_highest);
	}

}
//Another way. simple
//array[]= {21,454,5674,3}
//Arrays.sort(array); // assending order
//system.out.println("Second highest number="+array[array.length-2]);
//








