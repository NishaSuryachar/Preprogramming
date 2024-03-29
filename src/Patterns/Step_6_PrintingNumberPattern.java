package Patterns;

public class Step_6_PrintingNumberPattern {

	public static void main(String[] args)
	{
		System.out.println("=========");
		int n=4,num=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+" ");
				num++;
			}

			System.out.println();
		}

		System.out.println("=========");
		for(int i=1;i<=n;i++) 
		{
			int n1=n;
			for(int j=1;j<=n;j++)
			{
				System.out.print(n1+" ");
				n1--;
			}

			System.out.println();
		}
		System.out.println("=========");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		System.out.println("=========");
		for(int i=1;i<=n;i++) 
		{
			int n1=1;
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print(n1+" ");
					n1++;
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}


		System.out.println("=========");

		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}

		System.out.println("====upper patter===");
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(0+" ");
					}
					else
					{
						System.out.print(1+" ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("====upper right down patter===");
		for(int i=1;i<=n+1;i++) 
		{
			int numb=i,x=n;
			for(int j=1;j<=n+1;j++)
			{

				if(i>=j)
				{

					System.out.print(numb+" ");
					numb=numb+x--;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("====1 * patter===");
		int n1=4;
		for(int i=1;i<=n1;i++) 
		{
			int numb=1;
			for(int j=1;j<=n1*2-1;j++)
			{

				if(i+j>=n+1 && j-i<=n-1)
				{
					if((i+j)%2==0)
					{
						System.out.print("* ");

					}
					else
					{
						System.out.print(numb+" ");
						numb++;
					}
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