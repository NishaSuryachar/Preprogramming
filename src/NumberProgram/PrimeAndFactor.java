package NumberProgram;

public class PrimeAndFactor {

	public static void main(String[] args)
	{
		int n=5678,r=0;
		while(n>0)
		{
			r=n%10;
			int count=0;
			for(int i=1;i<=r;i++)
			{
				if(r%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("prime no "+r);
				System.out.println("factors of "+r);
				for(int i=1;i<=n;i++)
				{

					if(r%i==0)
					{
						System.out.println(i + " ");
					}
				}
			}
			n=n/10;
		}
	}
}


