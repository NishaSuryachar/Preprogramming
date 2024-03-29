package NumberProgram;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		 int n=121;
		 int temp=n;
	     int r=0;
	     int reverse=0;
	     while(n>0)
	     {
	        r=n%10;
	       reverse=reverse*10+r;
	       n=n/10;
	     }
	     System.out.println(reverse);
	     if(temp==reverse)
	     {
	    	 System.out.println("palindrome");
	     }
	     else
	     {
	    	 System.out.println("not palindrome");
	     }

	}

}
