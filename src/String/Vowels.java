package String;

public class Vowels {

	public static void main(String[] args)
	{
		String s="Welcome";
		s=s.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				v++;
				System.out.println(ch);
			}
			else if(ch>='a' && ch<='z')
			{
				c++;
			}
			
		}
		System.out.println("Numbers of vowels :"+v);
		System.out.println("Numbers of vowels :"+c);
		
	}

}
