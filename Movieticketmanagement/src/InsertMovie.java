import java.sql.*;
public class InsertMovie {
	
	public static void insert() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2004";
		String query ="insert into book values(?,?,?)";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 1004);
		pst.setString(2, "percy jackson");
		pst.setString(3, "fantasy");
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String [] args) throws Exception{
		insert();
		
		
	}
	

}
