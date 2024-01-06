package utils;
import java.sql.*;

public class DBUtils {
	private static Connection cn;
	//add a static method to ret DB connection
	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		//1. optional step , load JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. mandatory step : establish connection with DB
		//java.sql.DriverManager :class
		//API : public static Connection getConnection(String dbURL,String userName,String password) throws SQLException  
		String dbURL = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(dbURL, "root", "abhi1234");
		return cn;
	}
	
}
