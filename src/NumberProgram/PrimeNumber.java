package NumberProgram;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n=3;
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
        if(count==2)
        {
        	System.out.println("it is prime number");
        }
        else
        {
        	System.out.println("it is not prime number");
        }
	}

}
