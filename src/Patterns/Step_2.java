package Patterns;

public class Step_2 {

	public static void main(String[] args) 
	{
		int n=5;
       System.out.println("=========Primary Diagonal Pattern========");
       
       for(int i=1;i<=5;i++) 
	    {
	    	for(int j=1;j<=5;j++)
	    	{
	    		if(i==j )
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
       
 System.out.println("=========Secondary Diagonal Pattern========");
     
       for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i+j==n+1)
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
       System.out.println("=========z Pattern========");
       for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i==1 || i==5 || i+j==n+1)
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
       
       System.out.println("=========X Pattern========");
       for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i==j || i+j==n+1)
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
       System.out.println("=========N  Pattern========");
       for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(j==1||j==5||i==j)
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
       System.out.println("=========box + X Pattern========");
       for(int i=1;i<=n;i++) 
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i==1||j==1||i==n||j==n||i==j||i+j==n+1)
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
       
      