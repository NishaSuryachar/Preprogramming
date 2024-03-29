package String;

public class UpperLower {

	public static void main(String[] args)
	{
		String s="apple@123";
		System.out.println("~~~~~~~UpperCase~~~~~~~");
		System.out.println(s.toUpperCase());
		String str = s.toUpperCase();
		System.out.println(str);
		System.out.println();
		System.out.println("~~~~~~~LowerCase~~~~~~~");
		System.out.println(str.toLowerCase());
		System.out.println();
		System.out.println("~~~~~~~WithoutInBuiltMethods~~~~~~");
		System.out.println();
		System.out.println("~~~~~~~ConvertToUpper~~~~~~~~~~~~~");
		String s1="applesony@123";
		for(int i=0;i<s1.length();i++)
		{
		    char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
			int n=ch-32;
		    System.out.print((char)n);
			}
			else
			{
				System.out.print(ch);
			}
	     }
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~ConvertToLOWER~~~~~~~~~~~~~");
		String s2="APPLESONY@123";
		for(int i=0;i<s2.length();i++)
		{
			
			char ch=s2.charAt(i);
			if(ch>='A' && ch<='Z')
			{
			int n=ch+32;
		    System.out.print((char)n);
			}
			else
			{
				System.out.print(ch);
			}
	     }
	}
}
