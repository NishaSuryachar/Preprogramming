package NumberProgram;

public class CompositeNumber {

	public static void main(String[] args) 
	{
		int n=36;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("count is "+count);
		if(count>2)
		{
			System.out.println("it is composite number");
		}
		else
		{
			System.out.println("it is not composite number");
		}
	}

}
//it is a +ve integer that that has atleast 1 divisor other than 1 and itself.