package String;

public class SpecialCharacterPresentOrNOT
{
    public static void main(String[] args)
    {
		String s="tom123@gmail.com";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
			{
				
			}
			else
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("special character are present");
		}
		else
		{
			System.out.println("special character are not present");
		}
	}
}
