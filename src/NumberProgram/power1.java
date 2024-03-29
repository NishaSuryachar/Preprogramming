package NumberProgram;

public class power1 {

	public static void main(String[] args)
	{
		int n=256;
		int expo=3;
		while(n>0)
		{
		int base=n%10;
		int pow=1;
		for(int i=1;i<=expo;i++)
		{
			pow=pow*base;
		 }
		System.out.println(base+" -> "+pow);
		n=n/10;
		}
}
}