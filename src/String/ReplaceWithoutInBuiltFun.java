package String;

import java.util.Arrays;

public class ReplaceWithoutInBuiltFun {

	public static void main(String[] args) 
	{
		String s="Java is a simple lang";
		String re="funny";
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals("simple"))
			{
				a[i]=re;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
