package Arrays;

public class ArrayPattern {

	public static void main(String[] args) 
	{
		int n=4,x=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i+x;j++)
			{

				System.out.print("* ");

			}
			x++;
			System.out.println();
		}
    }
}
