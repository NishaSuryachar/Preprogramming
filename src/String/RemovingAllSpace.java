package String;

public class RemovingAllSpace {

	public static void main(String[] args) 
	{
		String s="  Good m o r ni ng ";
		//System.out.println(s.trim());
         
	    int st=0,en=s.length()-1;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(st)==' ')
	    	{
	    		st++;
	    	}
	    	else if(s.charAt(en)==' ')
	    	{
	    		en--;
	    	}
	    	else
	    	{
	    		System.out.print(s.charAt(st));
	    		st++;
	    	}
	    }
	}

}
