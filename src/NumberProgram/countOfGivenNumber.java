package NumberProgram;

public class countOfGivenNumber {

	public static void main(String[] args)
	{
		int n=36;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("count is "+count);
	}

}
