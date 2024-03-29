package Arrays;

public class PrimeElementFromArray {

	public static void main(String[] args) 
	{
		int[] a= {10,2,12,13,73,101,200};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
			if(c==2) 
			{
				System.out.println(a[i]);
			}
		}

	}

}
