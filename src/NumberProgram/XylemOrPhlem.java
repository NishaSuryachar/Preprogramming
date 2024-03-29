package NumberProgram;

public class XylemOrPhlem {

	public static void main(String[] args) 
	{
		int n=1234,last=n%10;
		n=n/10;
		int osum=0,isum=0; 
		while(n>=10)
		{
			int rem=n%10;
			isum=isum+rem;
			n=n/10;
		}
		osum=n+last;
		System.out.println(osum+ "->"+isum);
		if(osum==isum)
		{
			System.out.println("xylem");
		}
		else
		{
			System.out.println("phloem");
		}
	}

}
//sum of outer digit is equal to to sum of inner digit