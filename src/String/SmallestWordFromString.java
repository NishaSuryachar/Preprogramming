package String;

public class SmallestWordFromString
{
    public static void main(String[] args)
    {
    	String s="hello hi a welcome bye";
		String[] a = s.split(" ");
		String min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<min.length())
             {
                  min=a[i];
             }
		}
        System.out.println(min);
	}

}
