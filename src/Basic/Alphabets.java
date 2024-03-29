package Basic;

public class Alphabets {

	public static void main(String[] args)
	{
		char ch='%';
		if(ch >='a' && ch<='z')
		{
			System.out.println("Belongs to Small letter");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Belongs to capital letter");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Belongs to digits");
		}
		else 
		{
			System.out.println("Belongs to Special character");
		}	
	}
}
