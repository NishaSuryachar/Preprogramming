package Arrays;

import java.util.Arrays;

public class ReverseArrayEachElement {

	public static void main(String[] args)
	{
		//Reverse EachElements from Array
		
				int[] a1= {123,52,79,5206};
				
				for(int j1=0;j1<a1.length;j1++)
				{
				int n=a1[j1];
				int rev=0;
				while(n>0)
				{
					int r=n%10;
					rev=rev*10+r;
					n=n/10;
				}
				a1[j1]=rev;
				}
				System.out.println(Arrays.toString(a1));
	}

}
