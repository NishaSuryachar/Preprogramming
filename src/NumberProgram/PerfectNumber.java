package NumberProgram;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Given number is perfect number "+n);
		}
		else
		{
			System.out.println("Given number not is perfect number "+n);
		}

	}

}
