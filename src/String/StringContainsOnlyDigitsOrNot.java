package String;

public class StringContainsOnlyDigitsOrNot {

	public static void main(String[] args) 
	{
		String s="12345";
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String doesnot contains only digits ");
		}
		else
		{
			System.out.println("String contains only digits");
		}
	}

}
