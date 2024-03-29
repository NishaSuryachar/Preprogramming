package Arrays;

import java.util.Arrays;

public class MergeSort2 {

	public static void main(String[] args)
	{
		int[] a= {10,20,30,100,40,50,60};
		int index=3;
		int[] b=new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=index)
			{
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
