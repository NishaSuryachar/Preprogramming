package NumberProgram;

public class Factorial {

	public static void main(String[] args) 
	{
		int n=5;
		int pro=1;
		for(int i=n;i>=1;i--)
		{
			pro=pro*i;
		}
		System.out.println("Factorial of given number is "+pro);

	}

}
//product of +ve integer starting from 1 to till that no.