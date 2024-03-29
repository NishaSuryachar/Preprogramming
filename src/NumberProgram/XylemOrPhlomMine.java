package NumberProgram;

public class XylemOrPhlomMine {

	public static void main(String[] args)
	{
		int n=7295,sum=n%10;
		while(n>0)
		{
			if(n<=9)
			{
				sum=sum+n;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
