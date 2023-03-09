package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EmployeeDaoPrep 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES(?,?,?,?)";
		Connection conn = DBConnection.getDbInstance();
		PreparedStatement pstmt = null;
		int affectedRows = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.setString(1, ebean.getName());
				pstmt.setString(2, ebean.getSalary());
				pstmt.setString(3, ebean.getDsgn());
				pstmt.setString(4, ebean.getOrgName());
				affectedRows = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDaoPrep--insert---Db not connected");
		}
		return affectedRows;
	}
	private void delete() {
		// TODO Auto-generated method stub

	}
	private void update() {
		// TODO Auto-generated method stub

	}
	private void getAllRecords() {

	}
	public static void main(String[] args) 
	{
		EmployeeBean ebean = new EmployeeBean(0, "om", "4532", "SE", "Abc");
		
		EmployeeDaoPrep dao = new EmployeeDaoPrep();
		
		int affectedRows = dao.insert(ebean);
		if(affectedRows > 0) 
		{
			System.out.println("Employee records inserted ");
		}else 
		{
			System.out.println("Employee records not inserted ");
			
		}
	}
}