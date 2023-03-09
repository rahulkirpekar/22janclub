package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
// DataBaseName - MySql
public class DBConnection 
{
	// Singleton Desing Pattern---DbConnection
	private static Connection conn = null; 
	private DBConnection() 
	{
	}
	public static Connection getDbInstance() 
	{
		if(conn==null) 
		{
			conn = getConnection();
		}
		return conn;
	}
	// 2) create GetConnection Method
	private static Connection getConnection() 
	{
		FileInputStream fin = null;
		Properties prop = new Properties();
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\22janclub\\dbconfig.properties");
			prop.load(fin);
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		String urlName = prop.getProperty("URLNAME");
		String driverClass = prop.getProperty("DRIVERCLASS");
		String userName = prop.getProperty("USERNAME");
		String password = prop.getProperty("PASSWORD");

		Connection conn = null;
		try 
		{
			// 3) Load Driver Class
			Class.forName(driverClass);
			
			// 4) pass credential into DriverManager's getConnection Method
			conn = DriverManager.getConnection(urlName, userName, password);
			
			// 5) validate connectionm object
			if(conn != null) 
			{
				System.out.println("Db connected : " + conn);
			}else 
			{
				System.out.println("Db not connected : " + conn);
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}