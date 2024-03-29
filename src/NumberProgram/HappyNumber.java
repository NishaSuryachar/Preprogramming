package NumberProgram;

public class HappyNumber {

	public static void main(String[] args)
	{
		int n=4;
		while(true)
		{
			int sum=0;
			while(n>0)
			{
				int r=n%10;
				int sq=r*r;
				sum=sum+sq;
				n=n/10;
			}
			System.out.println(sum);
			if(sum==1)
			{
				System.out.println("happy");
				break;
			}
			else if(sum==4)
			{
				System.out.println("sad");
				break;
			}
			else
			{
				n=sum;
			}
		}
	}

}


