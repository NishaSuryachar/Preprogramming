package Basic;

public class NestedLoops {

	public static void main(String[] args)
	{
		System.out.println("=========for loop=============");
	//using for loop
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========while loop=============");
		//using while loop
		
        int i=1;
        while(i<=2)
        {
        	int j=1;
        	while(j<=5)
        	{
        		System.out.print(j+ " ");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
		
        System.out.println("========== do while ============");
    //using do while loop
	int k=1;
	do 
	{
		int j=1;
		do
		{
			System.out.print(j+" ");
			j++;
		}while(j<=5);
		k++;
		System.out.println();
	}while(k<=2);
		
	}

}
