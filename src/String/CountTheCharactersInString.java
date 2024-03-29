package String;

public class CountTheCharactersInString {

	public static void main(String[] args) 
	{
		String s1="Tom5763@gmail.com";
		s1 = s1.toLowerCase();
		int l=0,d=0,sp=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch >= 'a' && ch<='z')
			{
				l++;
			}
			else if(ch>='0' && ch<='9')
			{
				d++;
			}
			else
			{
				sp++;
			}
		}
		System.out.println("Number of characters:"+l);
		System.out.println("Number of digits:"+d);
		System.out.println("Number of Special characters:"+sp);
		}


	}


