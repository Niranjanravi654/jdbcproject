import java.sql.*;
 
 public class Updatebook{
	public static void update() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2004";
		String query ="update books set Genre='action' where Book_ID=102 ";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		update();
	}


}
