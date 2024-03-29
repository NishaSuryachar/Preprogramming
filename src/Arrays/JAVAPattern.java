package Arrays;

public class JAVAPattern {

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("======================JAVA==============================");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=26;j++)
			{
				if(i==1)
				{
					if(j==4||j==9||j==13||j==19||j==23)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			for(int j=1;j<=26;j++)
			{
				if(i==2)
				{
					if(j==4||j==8||j==10||j==14||j==18||j==22||j==24)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}

			for(int j=1;j<=26;j++)
			{
				if(i==3)
				{
					if(j==1||j==4||j>=7&&j<=11||j==15||j==17||j>=21&&j<=25)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}

			for(int j=1;j<=26;j++)
			{
				if(i==4)
				{
					if(j==2||j==3||j==4||j==6||j==12||j==16||j==20||j==26)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("======================JAVA============================");
	}
}


