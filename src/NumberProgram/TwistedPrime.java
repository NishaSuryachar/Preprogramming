package NumberProgram;

public class TwistedPrime {

	public static void main(String[] args) 
	{
		int n=13;
		int temp=n;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
        if(count==2)
        {
        	int r=0,rev=0;
        	while(n>0)
        	{
        	r=n%10;
        	rev=rev*10+r;
        	n=n/10;
           }
        	System.out.println(rev);
        	int c2=0;
        	for(int i=1;i<=rev;i++)
        	{
        		if(rev%i==0)
        		{
        			c2++;
        		}
        	}
        		if(c2==2)
        		{
        			System.out.println("Twisted Prime");
        		}
        		else
        		{
        			System.out.println("not Twisted Prime");
        		}
        	}
        else
        {
        	System.out.println("it is not prime number");
        }
     }
}
