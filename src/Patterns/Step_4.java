package Patterns;

public class Step_4 {

	public static void main(String[] args) {
		int n=4;
System.out.println("===== + pattern====");
		
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i==n|| j==n)
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
System.out.println("===== 4 triangle pattern====");
		
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i+j<=n+1||j-i>=n-1 ||i-j>=n-1|| i+j>=n*3-1)
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
	
		System.out.println("====upper pyramid=====");
		
		for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i+j>=n+1 && j-i<=n-1)
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

System.out.println("====down pyramid=====");
		
		for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i<=j && i+j<=n*2)
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
		
System.out.println("====star pattern=====");
		
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n*2-1;j++)
	    	{
	    		if(i==j ||i+j==n*2 ||i==n || j==n)
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

System.out.println("====RIGHT pyramid=====");
		
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i+j>=n+1 &&  i-j<=n-1)
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
		System.out.println("====LEFT pyramid=====");
		for(int i=1;i<=n*2-1;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i>=j && i+j<=n*2)
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
