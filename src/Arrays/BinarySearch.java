package Arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args)
	{
		int[] a= {5,17,20,90,98,10,100};
		int ele=98;
		Arrays.sort(a);
		int l=0,r=a.length-1;
		boolean flag=false;
		while(l<=r)
		{
			int mid=(l+r)/2;
			System.out.println("mid -> "+mid);

			if(ele==a[mid])
			{
				flag=true;
				System.out.println("element found");
				break;
			}
			else if(ele>a[mid])
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
