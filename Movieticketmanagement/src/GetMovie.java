import java.sql.*;
public class GetMovie {
	public static void selectData() throws Exception {
   	 String url="jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2004";
		String Query="select *from book";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("Book id "+rs.getInt(1));
			System.out.println("Book name "+rs.getString(2));
			System.out.println("Book Type "+rs.getString(3));
		}
		con.close();
;	}
	public static void main(String [] args) throws Exception{
		selectData();
		
		

}

}
