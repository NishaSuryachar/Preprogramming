package NumberProgram;

public class Power {

	public static void main(String[] args)
	{
		int base=2;
		int expo=4;
		int pow=1;
		for(int i=1;i<=expo;i++)
		{
			pow=pow*base;
		}
		System.out.println(pow);

	}

}
