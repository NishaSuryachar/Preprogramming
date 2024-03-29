package String;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		String s1="level",rev="";
		String s2=s1;
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
        if(s2.equals(rev))
        {
        	System.out.println("String is palindrome");
        }
        else
        {
        	System.out.println("String is not palindrome");
        }
	}
}
