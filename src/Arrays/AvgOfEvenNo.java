package Arrays;

public class AvgOfEvenNo {

	public static void main(String[] args) 
	{
		int[] a= {10,5,6,7,11,12,14};
		double avg=0,sum=0,count=0;;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				count++;
			}
		}
		avg=sum/count;
		System.out.println(avg);
	}
}
