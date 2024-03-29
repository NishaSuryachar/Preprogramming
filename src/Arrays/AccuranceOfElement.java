package Arrays;

public class AccuranceOfElement {

	public static void main(String[] args)
	{
		int[] a= {10,2,10,2,4,5,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			 if(a[i]!=Integer.MAX_VALUE)
		        {
		        	System.out.println(a[i]+" Accurance is "+c);
		        }
		}
       
	}

}
