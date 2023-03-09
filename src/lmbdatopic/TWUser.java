package lmbdatopic;

public class TWUser implements Vehicle
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new TWUser();
		
		vehicle.getSpecification(); 
		
	}
	@Override
	public void getSpecification() 
	{
		System.out.println("TWUSer---getSpecification()");
	}
}
