package NumberProgram;

public class SunnyNumber {

	public static void main(String[] args) 
	{
		int n=63,n1=n+1;
		boolean flag=false;
		for(int i=1;i<=n/2;i++)
		{
			if(i*i==n1)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println("not sunny number");
		}
	}
}
