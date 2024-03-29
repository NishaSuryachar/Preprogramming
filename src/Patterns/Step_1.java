package Patterns;

public class Step_1 {

	public static void main(String[] args)
	{
		System.out.println("=====L shape======");
	    for(int i=1;i<=5;i++) //rows
		    {
		    	for(int j=1;j<=5;j++)//col
		    	{
		    		if(i==5 || j==1)
		    		{
		    		 System.out.print("* ");
		    		}
		    	}
		       System.out.println();
		    }
		
		System.out.println("========oppo L=======");
		 for(int i=1;i<=5;i++) //rows
		    {
		    	for(int j=1;j<=5;j++)//col
		    	{
		    		if(i==5 || j==5)
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
		 System.out.println("=====Inverted L=====");
			for(int i=1;i<=5;i++) //rows
		    {
		    	for(int j=1;j<=5;j++)//col
		    	{
		    		if(i==1 || j==1)
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
			
			 System.out.println("=====opp Inverted L=====");
				for(int i=1;i<=5;i++) //rows
			    {
			    	for(int j=1;j<=5;j++)//col
			    	{
			    		if(i==1 || j==5)
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
				
			System.out.println("======Equal pattern=====");
			for(int i=1;i<=5;i++) //rows
		    {
		    	for(int j=1;j<=5;j++)//col
		    	{
		    		if(i==1 || i==5 || j==0)
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
			
			System.out.println("======Parellel pattern=====");
			for(int i=1;i<=5;i++) //rows
		    {
		    	for(int j=1;j<=5;j++)//col
		    	{
		    		if(i==0 || j==1 || j==5)
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
			System.out.println("======c======");
			for(int i=1;i<=5;i++) 
		    {
		    	for(int j=1;j<=5;j++)
		    	{
		    		if(i==1 || j==1 || i==5 )
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
			
			System.out.println("======oppo c======");
			for(int i=1;i<=5;i++) 
		    {
		    	for(int j=1;j<=5;j++)
		    	{
		    		if(i==1 || j==5 || i==5 )
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
			System.out.println("======Box c======");
			for(int i=1;i<=5;i++)
		    {
		    	for(int j=1;j<=5;j++)
		    	{
		    		if(i==1 || j==1 || i==5 || j==5)
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
			System.out.println("=====Full shape======");
		    for(int i=1;i<=5;i++) //rows
			    {
			    	for(int j=1;j<=5;j++)//col
			    	{
			    		 System.out.print("* ");
			    	}
			       System.out.println();
			    }
	}

}
