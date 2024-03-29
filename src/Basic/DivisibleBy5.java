package Basic;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
		System.out.println("");
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%5==0)
		{
			System.out.println("The given number is Divisible by 5");
			if(n%2==0)
			{
				System.out.println("The given number is even number");
			}
			else
			{
				System.out.println("The given number is not even number");
			}
		}
		else
		{
			System.out.println("The given number is not Divisible by 5");
		}
		}
		flag=false;
  }
}

