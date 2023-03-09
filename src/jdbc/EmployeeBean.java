package jdbc;

// BEAN--POJO class - Work as a Data Transporter
public class EmployeeBean 
{
	  private int id     ;//   int         	
	  private String name   ;// varchar(50)
	  private String salary ;// varchar(50)
	  private String dsgn   ;// varchar(50)
	  private String orgName;// varchar(50)

	  public EmployeeBean() 
	  {
	  }

	public EmployeeBean(int id, String name, String salary, String dsgn, String orgName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}

	public String getOrgName() 
	{
		return orgName;
	}
	public void setOrgName(String orgName) 
	{
		this.orgName = orgName;
	}
}
