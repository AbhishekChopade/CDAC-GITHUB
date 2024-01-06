package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		try(Connection connection=openConnection()){
			System.out.println("connection to DB "+connection);
		}catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
