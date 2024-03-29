package NumberProgram;

public class ProductOfDigit {

	public static void main(String[] args)
	{
		int n=5678;
		int r=0;
		int p=1;
		while(n>0)
		{
			r=n%10;
		    p=p*r;
		    n=n/10;
		}
		System.out.println(p);

	}

}
