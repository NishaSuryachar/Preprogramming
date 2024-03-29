package NumberProgram;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		int n=153;
		int n1=n;
		int temp=n1;
		int count=0;
		int sum=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		while(n1>0)
		{
			int base=n1%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*base;
			}
			n1=n1/10;
			sum=sum+pow;
		}
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("given no is Armstrong no");
		}
		else
		{
			System.out.println("given no is not Armstrong no");
		}
	}
}	
//armstrong number:sum of power of each digit is equals to given number	