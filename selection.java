
public class selection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {5 , 4 ,3 ,2 ,6,8 ,10,1};
		int n = 8 , i , j , temp;           // length of the array
		
		for(i=0;i<n;i++)
		{
			for(j = i+1 ; j < n; j++)
			{
				if(a[i] > a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;	
					}	
			}	
		}
		
		for(j = 0 ;j<n; j++)
		{
			System.out.println(a[j]);
		}

	}

}
