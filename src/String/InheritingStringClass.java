package String;

public class InheritingStringClass 
{
	public static void main(String[] args) 
	{
		
		String s1=new String("java");
		String s2=new String("java");
		
		String s3="java";
		String s4="java";
		
		System.out.println("-----double equal operator------");
		System.out.println(s1==s2);//false
		System.out.println(s3==s4);//true
		
		System.out.println("-----equals method-------");
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.equals(s4));//true
		
		System.out.println("====equalsIgnoreCase======");
		String s5="Level";
		String s6="leveL";
		
		
		System.out.println(s5.equalsIgnoreCase(s6));
		
		
		String s="hello";
		String s9=new String("hello");
		System.out.println(s==s9);//false
		System.out.println(s.equals(s9));//true
		
		
		
	}

}
