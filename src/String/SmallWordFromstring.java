package String;

import java.util.Arrays;

public class SmallWordFromstring {

	public static void main(String[] args) 
	{
		String s="java python html css";
		String[] a = s.split(" ");
		String min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i].length()<min.length())
			{
				min=a[i];
			}
		}
		char[] ch = min.toCharArray();
		int max1=ch[0];
		char a1=0;

		for(int j=1;j<ch.length;j++)
		{
			if(ch[j]>=max1)
			{
				a1 = ch[j];
			}
			
		}
		System.out.println("The largest Character in the smallest String: "+a1);
	}

}


