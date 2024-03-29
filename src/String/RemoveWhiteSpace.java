package String;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String s="A pp le";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch != ' ')
			{
				System.out.print(ch);
			}
		}
       
	}

}
