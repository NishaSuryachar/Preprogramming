package NumberProgram;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		int n=64;
		boolean flag=false;
		for(int i=1;i<=n/2;i++)
		{
			System.out.println(i);
			if(i*i==n)
			{
				System.out.println(n+"->"+i);
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}

	}

}
