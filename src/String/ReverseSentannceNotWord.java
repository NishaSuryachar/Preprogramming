package String;

import java.util.Arrays;

public class ReverseSentannceNotWord {

	public static void main(String[] args)
	{
		String s="java is a programmimg language";
		String[] a = s.split(" ");
		int j=0;
		String rev=" ";
	    for(int i=a.length-1;i>=0;i--)
	    {
	         System.out.print(a[i]+" ");
	    }
	   
	}
}
