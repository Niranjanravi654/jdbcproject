import java.sql.*;
public class Getbook {
	public static void get() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2004";
		String query ="select * from books ";
		Connection con= DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(query);
		while(rs.next()) {
			System.out.println("Book_ID "+rs.getInt(1));
			System.out.println("Title "+rs.getString(2));
			System.out.println("Author "+rs.getString(3));
			System.out.println("ISBN "+rs.getString(4));
			System.out.println("Genre "+rs.getString(5));
			System.out.println("Publisher "+rs.getString(6));
			System.out.println("Date "+rs.getDate(7));
			System.out.println("Price "+rs.getInt(8));
			System.out.println("Cost_Price "+rs.getInt(9));
			System.out.println("Stock_Quantity "+rs.getInt(10));
			System.out.println("Language "+rs.getString(11));
			System.out.println("Edition "+rs.getString(12));
			System.out.println("Page_Count "+rs.getInt(13));
			System.out.println("Book_Format "+rs.getString(14));
			System.out.println("Description "+rs.getString(15));
			System.out.println("Book_Cover_Image"+rs.getString(16));
			
		}
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		get();
	}


}
