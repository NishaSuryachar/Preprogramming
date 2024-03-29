package NumberProgram;

public class SumOrProductFactors {

	public static void main(String[] args)
	{
		int n=6;
		int sum=0;
		int pro=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
		    	sum=sum+i;
		    	pro=pro*i;
	     	}
	   }
		System.out.println("sum of " +sum);
		System.out.println("pro of "+pro);
	 }
}
