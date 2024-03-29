package Basic;

public class CountingNumberOfDigits {

	public static void main(String[] args)
	{
	   int n=234516;
	   int r=0;
	   int count=0;
	   while(n>0)
	   {
		   n=n/10;
		   count++;
		 
	   }
	   System.out.println(count);
	}

}
