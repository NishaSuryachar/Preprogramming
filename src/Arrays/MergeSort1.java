package Arrays;

import java.util.Arrays;

public class MergeSort1 {

	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50};
		int[] b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		System.out.println("=====================");
		int[] a1= {10,20,30,40,50};
		int[] b1=new int[a.length-1];
		int j=0;
		for(int i=0;i<a1.length-1;i++)
		{
			if(i<b.length)
			{
				b1[j]=a1[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b1));
	}

}
