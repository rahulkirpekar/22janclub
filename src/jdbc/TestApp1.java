package jdbc;

import java.sql.Connection;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Connection conn1 = DBConnection.getDbInstance();
		Connection conn2 = DBConnection.getDbInstance();
		Connection conn3 = DBConnection.getDbInstance();
		Connection conn4 = DBConnection.getDbInstance();
		
		System.out.println("conn1 : " + conn1);
		System.out.println("conn2 : " + conn2);
		System.out.println("conn3 : " + conn3);
		System.out.println("conn4 : " + conn4);
		
	}

}
