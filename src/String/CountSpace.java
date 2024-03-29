package String;

public class CountSpace {

	public static void main(String[] args)
	{
		String s="G O O D M O N I N G";
		int c=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
			     c++;
			}
			else if(ch==' ')
			{
				sp++;
			}
		}
System.out.println("No of chararcter are :"+c);
System.out.println("No of spaces are :"+sp);
	}

}
