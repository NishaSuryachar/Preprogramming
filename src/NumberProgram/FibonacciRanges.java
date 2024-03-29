package NumberProgram;

public class FibonacciRanges {

	public static void main(String[] args)
	{
		int n1=0,n2=1,sum=0;
		int target=5,ranges=10;
		if(target<=ranges)
		{
		for(int i=1;i<=10;i++)
		{
			if(target==i)
			{
				System.out.println(n1);
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		}
		else
		{
			System.out.println("Target should be less than range");
		}
		

	}

}
