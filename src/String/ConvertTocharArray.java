package String;

import java.util.Arrays;

public class ConvertTocharArray {

	public static void main(String[] args)
	{
		String s="hello";
		char[] a=s.toCharArray();
		System.out.println(Arrays.toString(a));
        
		System.out.println("===ConvertToChar[]WithoutUsingtoCharArray()====");
		String s1="hello";
		char[] a1=new char[s1.length()];
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch=s1.charAt(i);
	    	a1[i]=ch;
	    	
	    }
	    System.out.println(Arrays.toString(a1));
	
	
	}

}
