package Arrays;

public class OddIndex {

	public static void main(String[] args) 
	{
		int[] a= {10,13,50,70,4,8,0};
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
