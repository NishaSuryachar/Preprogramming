package Arrays;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int[] a= {50,70,90,80,89};
		int n=180;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("element found");

		}
		else
		{
			System.out.println("element not found");
		}

	}
}


