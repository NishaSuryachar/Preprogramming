package NumberProgram;

public class AutoMorphic {

	public static void main(String[] args) 
	{
		int n=25,sq=n*n;
		while(n>0)
		{
			int r1=n%10;
			int r2=sq%10;
			if(r1==r2)
			{
				n=n/10;
				sq=sq/10;
			}
			else
			{
				System.out.println("not automerphic");
                 break;
			}
		}
		if(n==0)
		{
			System.out.println("automerphic");
		}
		
	}

}

//Automorphic no:given number should be at last
