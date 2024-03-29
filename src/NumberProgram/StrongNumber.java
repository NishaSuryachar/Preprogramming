 package NumberProgram;

public class StrongNumber {

	public static void main(String[] args)
	{
		int n=145;
		int temp=n;
		int r=0;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			int fact=1;
			for(int i=r;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println(fact);
			n=n/10;
		    sum=sum+fact;
		}
		System.out.println(sum);
        if(temp==sum)
        {
        	System.out.println("it is strong number ");
        }
        else
        {
        	System.out.println("not strong number");
        }
	}
}
//strong number:sum of factorial of each digit is equals to given number