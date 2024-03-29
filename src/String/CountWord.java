package String;

public class CountWord {

	public static void main(String[] args) 
	{
		String s="Hello hi welcome bye";
		int count=0;
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
