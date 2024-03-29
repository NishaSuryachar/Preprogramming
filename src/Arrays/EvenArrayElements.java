package Arrays;

import java.util.Arrays;

public class EvenArrayElements {

	public static void main(String[] args) 
	{
		int[] a= {5,2,12,7,9,10,16};
		int count=0;
		System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2==0)
        	{
        		System.out.println(i);
        		count++;
        	}
        }
        System.out.println("count of even no: ");
        System.out.println(count);
	}

}
