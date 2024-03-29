package Basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println(" 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.exit\n");
		System.out.println("=======================");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter A and B value");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition of two number is "+c);
			break;
		}
		case 2:
		{
			System.out.println("Enter A and B value");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a-b;
			System.out.println("Substraction of two number is "+c);
			break;
		}
		case 3:
		{
			System.out.println("Enter A and B value");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a*b;
			System.out.println("Multiplication of two number is "+c);
			break;
		}
		case 4:
		{
			System.out.println("Enter A and B value");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Division of two number is "+c);
			break;
		}
		case 5:
		{
			System.out.println("Thank you Bye");
			System.exit(0);
		}
		default:
		{
			System.err.println("Invalid choice");
			
		}
	    }
	}
}
		
}


