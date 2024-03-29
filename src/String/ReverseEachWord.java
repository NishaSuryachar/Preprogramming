package String;

import java.util.Arrays;

import Arrays.ReverseArray;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String s="e sala cup namde";
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String str = a[i];
			String rev=" ";
			for(int j=str.length()-1;j>=0;j--)
			{
				char ch = str.charAt(j);
				rev=rev+ch;
			}
			a[i]=rev;
		}
	System.out.println(Arrays.toString(a));
		
	}
}
