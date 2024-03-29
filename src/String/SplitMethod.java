package String;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args)
	{
		String s="java is a programming language";
        String[] a = s.split("a");
        String[] a1 = s.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
	}

}
