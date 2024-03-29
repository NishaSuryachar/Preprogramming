package Basic;

public class Spy {

	public static void main(String[] args)
	{
		int n=123;
		int sum=0;
		int pro=1;
		int r=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
		    pro= pro*r;
			n=n/10;
		}
		if(sum==pro)
		{
			System.out.println("spy Number");
		}
		else
		{
			System.out.println("not spy Number");
		}
	}
}
