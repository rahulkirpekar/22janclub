package innerclasstopic;

public class AxisBank extends Bank
{
	@Override
	public void getCustomerInformation() 
	{
		System.out.println("Axis Customer");
	}
	public static void main(String[] args) 
	{
		AxisBank bank = new AxisBank();
		bank.getCustomerInformation();
	}
}
