package Arrays;

import java.util.Arrays;

public class MergeToArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int[] b= {50,60,70};
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
		
	}

}
