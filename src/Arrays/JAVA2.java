package Arrays;

public class JAVA2 {

	public static void main(String[] args)
	{
		int n=4;
		System.out.println("======================JAVA==============================");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n||i==n&&j!=1 ||i==3 && j==1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		
			//A
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
			//V
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
			//a
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
	}

}
