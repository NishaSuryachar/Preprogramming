package Arrays;

public class JAVASeperatepattern {

	public static void main(String[] args) 
	{
		System.out.println("==========J===========");
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==4 || i==4 && j>1 ||i==3 && j==1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
        }
		System.out.println("==========A============");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j==n+1 || j-i==n-1|| i==n-1 && j>=2 && j<=6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("==========V============");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i==j || i+j==n*2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("==========A============");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j==n+1 || j-i==n-1|| i==n-1 && j>=2 && j<=6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("==========k============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1||i+j==5||i-j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		
		
		
	}

}
