package Arrays;

import java.util.Scanner;

public class ReadDataFromUserAndOutput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
//		//index is less than array index
//		System.out.println(a[-1]);
//		//index is equal to array length
//		System.out.println(a[5]);
//		//index is more thay the array index
//         System.out.println(a[100]);
//         
//         for(int i=0;i<a.length;i++)
//         {
//        	 a[i]=sc.nextInt();
//         }
         for(int i=0;i<5;i++)
         {
        	 System.out.println(a[i]);
         }
	}

}
