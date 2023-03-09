package oops;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Address permanentAddress = new Address("1", "cg road", "navrangpura", "ahmedabad", "gujarat", "india", "380015", "1324567", "324567");
		Address tempAddress = new Address("1", "cg road", "navrangpura", "ahmedabad", "gujarat", "india", "380015", "1324567", "324567");
		
		Address a[] = new Address[2];
		a[0]= permanentAddress;
		a[1]= tempAddress;
		
		
		Employee omEmployee  = new Employee(1, "rahul", "se", "royaltech", 23245,a);
		
//		omEmployee.disp();
		
		System.out.println("omEmployee - " + omEmployee);
		System.out.println("omEmployee.address - " + omEmployee.address);

		omEmployee.address[0].
				
		
	}
}
