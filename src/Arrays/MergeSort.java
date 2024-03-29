package Arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args)
	{
		int[] a= {10,20,30};
		int[] b= {40,50};
		int[] c=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
		for(int i=0;i<b.length;i++)
		{
			c[j]=b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
	}

}
