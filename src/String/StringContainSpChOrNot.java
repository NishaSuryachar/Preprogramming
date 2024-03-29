package String;

public class StringContainSpChOrNot {

	public static void main(String[] args) 
	{
		String s="abcd@#$%";
		boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
        	char ch = s.charAt(i);
        	if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
        	{
        		flag=false;
        		break;
        	}
        }
        if(flag==true)
        {
        	System.out.println("String contains only Special Characters");
        }
        else
        {
        	System.err.println("String contains not only Special Characters");
        }
	}

}
