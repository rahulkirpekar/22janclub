package oops;

public class Employee 
{
	int id ;
	String name,dsgn ,orgname ;
	double salary ;
	Address address[] = new Address[2];
	public Employee() 
	{
	}
	public Employee(int id, String name, String dsgn, String orgname, double salary,Address address[]) 
	{
		this.id = id;
		this.name = name;
		this.dsgn = dsgn;
		this.orgname = orgname;
		this.salary = salary;
		this.address = address;
	}
	void disp() 
	{
		System.out.println(id + " " + name + " " + dsgn + " " + orgname +" " +salary);
 	}
}
