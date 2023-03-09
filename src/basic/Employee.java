package basic;

public class Employee 
{
	int eid;
	String name;
	float salary;
	Employee() 
	{
		System.out.println("START :: Default Constructor---"+this);
		eid=1;
		name="rahul";
		salary=12;
		System.out.println("Exit :: Default Constructor");
	}
	Employee(int eid,String name) 
	{
		this();
		System.out.println("START :: TWO-PARA Constructor---"+this);
		this.eid=eid;
		this.name=name;
		System.out.println("Exit :: TWO-PARA Constructor");
	}
	Employee(int eid,String name,int salary) 
	{
		this(eid,name);
		System.out.println("START :: PARA Constructor---"+this);
		this.salary=salary;
		System.out.println("Exit :: PARA Constructor");
	}
	Employee(Employee e) 
	{
		System.out.println("START :: COPY Constructor---"+this);
		this.eid=e.eid;
		this.name=e.name;
		this.salary=e.salary;
		System.out.println("Exit :: COPY Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main Method");
//		int no ;
//		System.out.println("No : " + no);
		Employee e = new Employee(1,"rahul",12);
//		Employee e1 = new Employee(e);
		
		System.out.println(e.eid + " " + e.name + " " + e.salary + " ---> " + e.hashCode() );
		System.out.println(e.eid + " " + e.name + " " + e.salary + " ---> " + e.toString() );
		
//		System.out.println("id -- "+e1.eid );
//		System.out.println("Name -- "+e1.name );
//		System.out.println("salary -- "+e1.salary);
		
		System.out.println("EXIT :: Main Method");

	}
	@Override
	public String toString() 
	{
		System.out.println("mari call thae");
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
