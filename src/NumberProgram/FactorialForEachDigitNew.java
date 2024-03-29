package NumberProgram;

public class FactorialForEachDigitNew {

	public static void main(String[] args) 
	{
		int n=245;
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
		System.out.println("sum of factorial "+sum);
	}

}
