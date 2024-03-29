package Patterns;

public class Step_3 {

	public static void main(String[] args)
	{
		int n=4;

		System.out.println("========Left upper triangle Pattern========");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
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

		System.out.println("========right upper triangle Pattern========");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
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

		System.out.println("===== Left right upper triangle====");

		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i>=j || i+j>=n*2)
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

		System.out.println("===== Left right Down triangle===");

		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j<=n+1||j-i>=n-1)
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

		System.out.println("========left-down+leftUpper triangle Pattern========");
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1||i-j>=n-1)
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

		System.out.println("========right-down+right+upper triangle Pattern========");

		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=i||i+j>=n*2)
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

		System.out.println("========inverted right triangle========");
		for(int i=1;i<=n*2-1;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
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
		System.out.println("========inverted Left triangle========");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
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





