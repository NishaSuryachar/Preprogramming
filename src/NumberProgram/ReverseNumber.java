package NumberProgram;

public class 	ReverseNumber {

	public static void main(String[] args)
	{
	     int n=1234;
	     int r=0;
	     int reverse=0;
	     while(n>0)
	     {
	        r=n%10;
	       reverse=reverse*10+r;
	       n=n/10;
	     }
	     System.out.println(reverse);
     
	}

}
