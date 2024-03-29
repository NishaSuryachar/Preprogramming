package Arrays;

public class SumOfArrayElements {

	public static void main(String[] args)
	{
//		int[] a= {90,70,85,69,39,45};
//		int count=0;
//		int sum=0;
//		int avg=0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//			count++;
//		}
//		avg=sum/count;
//		System.out.println(avg);
		
		int[] a= {90,70,85,69,39,45};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);

	}

}
