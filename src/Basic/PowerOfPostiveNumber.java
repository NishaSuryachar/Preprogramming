package Basic;

public class PowerOfPostiveNumber {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=-5;i<=5;i++)
		{
			  if(i>=0 && i%2==0)
			  {
					count++;
			  }
	    }
		//System.out.println(count);  
		for(int i=-5;i<=5;i++)
		{
			int pow=1;
			for(int j=1;j<count;j++)
			{
				if(i>=0 && i%2==0)
				{
					pow=pow*i;
				}
			}
			if(i>=0 && i%2==0)
			{
				System.out.println(i + "=>"+pow);
			}
		}
	}
}

