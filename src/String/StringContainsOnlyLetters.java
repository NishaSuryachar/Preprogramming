package String;

public class StringContainsOnlyLetters {

	public static void main(String[] args) 
	{
		String s="hello";
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String doesnot contains only characters ");
		}
		else
		{
			System.out.println("String contains only characters");
		}
	}

}
