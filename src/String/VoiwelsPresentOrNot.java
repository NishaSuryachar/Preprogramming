package String;

public class VoiwelsPresentOrNot {

	public static void main(String[] args)
	{
		String s="spiders";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				flag=true;
				System.out.println(ch);
				
			}
		}
		if(flag==true)
		{
			System.out.println("Vowels present");
		}
		else
		{
			System.out.print("Vowels Not present");
		}
	}
}
