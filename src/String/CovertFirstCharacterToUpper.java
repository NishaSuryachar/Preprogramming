package String;

public class CovertFirstCharacterToUpper {

	public static void main(String[] args)
	{
		String s="smith@123";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0 && ch>='a' && ch<='z')
			{
			   int n=ch-32;
			   System.out.print((char)n);
			 }
			else
			{
				System.out.print(ch);
			}
		}
		
		
	}

}
