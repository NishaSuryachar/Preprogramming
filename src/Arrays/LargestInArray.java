package Arrays;

public class LargestInArray {

	public static void main(String[] args) 
	{
		int[] a= {5,-2,0,11,4,8,3};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println("Largest Element "+max);

		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest Element "+ min);
	}

}
