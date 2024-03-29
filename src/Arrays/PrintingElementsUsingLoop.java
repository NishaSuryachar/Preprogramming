package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class PrintingElementsUsingLoop {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int[] a=new int[size];
        
        
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}

}
