import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class Insert {

	

	
	public Insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	

	}
	
	public void insertMov(String title, String director, String genre, int score) {
		
		String url="";
		String id="hr";
		String pw="hr";
		Connection conn;		
		String sql="";
		try {
			conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement ps = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
