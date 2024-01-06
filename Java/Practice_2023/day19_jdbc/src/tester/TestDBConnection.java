package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		try(
			Connection cn=openConnection();
			Statement st = cn.createStatement(); 
			ResultSet rst = st.executeQuery("select * from my_emp");
			)
		{
			while(rst.next())
					
				System.out.printf("Emp ID %d Name %s Address %s Sal %.1f Dept Id %s Join Date %s%n",
						rst.getInt(1),rst.getString(2),rst.getString(3),rst.getDouble(4),rst.getString(5),rst.getDate(6));
		}catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
