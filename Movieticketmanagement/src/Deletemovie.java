import java.sql.*;

public class Deletemovie {
	
	public static void delete() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2004";
		String query ="delete  from book where bookid=1002 ";
		Connection con= DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String [] args) throws Exception{
		delete();
		
		

}

}
