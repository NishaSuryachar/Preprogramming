package Arrays;

public class PrimeFactorForElement {

	public static void main(String[] args) 
	{
		int[] a= {12,6,20,10,22};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			System.out.print(n+"-> ");
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					int count=0;
					for(int k=1;k<=j;k++)
					{
						if(j%k==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.print(j+" ");
					}
                 }
			}
			System.out.println();
		}
	}

}
