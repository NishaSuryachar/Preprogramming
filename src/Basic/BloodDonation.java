package Basic;

public class BloodDonation {

	public static void main(String[] args) 
	{
		int weight=55;
		String Blood_group="o+";
		if(weight>45)
		{
			if(Blood_group=="o+")
			{
				System.out.println("The person is eligible for blood donation");
			}
			else
			{
				System.out.println("The person is not  eligible for blood donation");
			}
		}
		else
		{
			System.out.println("weight should more than 45kg");
		}
	}

}
