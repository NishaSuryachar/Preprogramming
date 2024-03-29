package Patterns;

public class Step_5 {

	public static void main(String[] args)
	{
		System.out.println("====diamond pyramid=====");
		int n=4;
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=n*3-1)
	    		{
	    		 System.out.print("* ");
	    		}
	    		else
	    		{
	    			 System.out.print("  ");
	    		}
	    	}
	       System.out.println();
	    }
		System.out.println("====Buuflyfly pyramid=====");
		
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i>=j && i+j<=n*2 || i+j>=n*2 && i<=j)
	    		{
	    		 System.out.print("* ");
	    		}
	    		else
	    		{
	    			 System.out.print("  ");
	    		}
	    	}
	       System.out.println();
	    }

	}

}
