package innerclasstopic;

public class TestApp 
{
	public static void main(String[] args) 
	{
		//Annonmous Inner Class
		// --innerclasstopic.TestApp$1@76ed5528
		Bank bank1 = new Bank() 
		{
			@Override
			public void getCustomerInformation() 
			{
				System.out.println("1--Hi I am Bank Customer - " + this);
			}
		};
		Bank bank2 = new Bank() 
		{
			@Override
			public void getCustomerInformation() 
			{
				System.out.println("2---Hi I am Bank Customer - " + this);
			}
		};
		bank1.getCustomerInformation();
		bank2.getCustomerInformation();
	}
}
