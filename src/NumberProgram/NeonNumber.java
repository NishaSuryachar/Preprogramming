package NumberProgram;

public class NeonNumber {

	public static void main(String[] args)
	{
		int n=9,squr=n*n,r=0,sum=0;
		for(int i=1;i<n/2;i++)
		{
			
			while(squr>0)
			{
				 r=squr%10;
			     sum=sum+r;
				squr=squr/10;
			}
		}
		if(sum==n)
		{
			System.out.println("it is neon number");
		}
		else
		{
			System.out.println("it is not neon number");
		}

	}

}
