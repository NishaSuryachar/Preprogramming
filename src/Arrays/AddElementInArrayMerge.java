package Arrays;

import java.util.Arrays;

public class AddElementInArrayMerge {

	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6};
		int[] b=new int[a.length+2];
		int j=0;
		int index1=5,index2=2;
		int ele1=30,ele2=60;
		if(index1<b.length && index2<b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				if(i==index1)
				{
					b[i]=ele1;
				}
				else if(i==index2)
				{
					b[i]=ele2;
				}
				else
				{
					b[i]=a[j];
					j++;
				}
			}
			System.out.println(Arrays.toString(b));
		}
		else
		{
			System.out.println("Index should be less than "+b.length);;
		}
	}

}
