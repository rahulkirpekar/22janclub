package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		Statement stmt = null;
		int rowAffected = 0;
		// 1) Get Database Connection Object
		Connection conn = DBConnection.getDbInstance();
		// 2) validate Database connection object
		if (conn!=null) 
		{
			try 
			{
				// 3) Create Statement Object
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao---insert----Db not connected");
		}
		return rowAffected;
	}
	public void update() 
	{
		
	}
	public int delete(int id) 
	{
		Connection conn = DBConnection.getDbInstance();
		Statement stmt = null;
		String deleteQuery = "DELETE FROM employee WHERE id="+id;
		int affectedRows = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				affectedRows = stmt.executeUpdate(deleteQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao -- delete ----Db not Connected");
		}
		return affectedRows;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		Connection conn = DBConnection.getDbInstance();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String salary  = rs.getString(3);
					String dsgn  = rs.getString(4);
					String orgName = rs.getString(5);
					
					ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
					list.add(ebean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao----getAllRecords()----Db not connected");
		}
		return list;
	}
	public EmployeeBean getEmployeeById(int id)
	{
		String selectQuery = "SELECT * FROM employee WHERE id="+id;
		Connection conn = DBConnection.getDbInstance();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				
				rs.next();
				
				id = rs.getInt(1);
				String name = rs.getString(2);
				String salary  = rs.getString(3);
				String dsgn  = rs.getString(4);
				String orgName = rs.getString(5);
			
				ebean = new EmployeeBean(id, name, salary, dsgn, orgName);

			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao----getEmployeeById(int id)----Db not connected");
		}
		return ebean;
	}
	
	
	public static void main(String[] args) 
	{
		EmployeeDao edao = new EmployeeDao();
		EmployeeBean  ebean = edao.getEmployeeById(27);

		System.out.println(ebean.getId() + " " +ebean.getName() + " "+ ebean.getSalary() + " " +ebean.getDsgn() + " " +ebean.getDsgn());
		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			EmployeeBean ebean = list.get(i);
//			System.out.println(ebean.getId() + " " +ebean.getName() + " "+ ebean.getSalary() + " " +ebean.getDsgn() + " " +ebean.getDsgn());
//		}
//      ------------------INSERT CODE -----------------------------		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("Enter Id which you want to Delete : ");
//		int id = sc.nextInt();
//		EmployeeDao edao = new EmployeeDao();
//		int rowAffected = edao.delete(id);
//		
//		if (rowAffected > 0) 
//		{
//			System.out.println("Employee Record succeessfully Deleted : " + rowAffected);
//		} else 
//		{
//			System.out.println("Employee Record not Deleted : " + rowAffected);
//		}
//       ------------------INSERT CODE -----------------------------		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Salary : ");
//		String salary = sc.nextLine();
//		System.out.println("Enter Dsgn : ");
//		String dsgn = sc.nextLine();
//		System.out.println("Enter OrgName : ");
//		String orgName = sc.nextLine();
//		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
//		EmployeeDao edao = new EmployeeDao();
//		int rowAffected = edao.insert(ebean);
//		
//		if (rowAffected > 0) 
//		{
//			System.out.println("Employee Record succeessfully inserted : " + rowAffected);
//		} else 
//		{
//			System.out.println("Employee Record not inserted : " + rowAffected);
//		}
	}
}
