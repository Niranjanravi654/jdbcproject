import java.sql.*;
import java.util.Scanner;

public class Insertbook {
    public static void insert() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/sample";
        String username = "root";
        String password = "2004";
        String query = "insert into books(Title,Book_ID,Author,ISBN,Genre,Publisher,date,Price,Cost_Price,Stock_Quantity,Language,Edition,Page_Count,Book_Format,Description,Book_Cover) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter Title: ");
            String Title = sc.nextLine();
            
            System.out.println("Enter Book ID: ");
            int Book_ID = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter Book Author Name: ");
            String Author = sc.nextLine();
            
            System.out.println("Enter ISBN: ");
            String ISBN = sc.nextLine();
            
            System.out.println("Enter Book Genre: ");
            String Genre = sc.nextLine();
            
            System.out.println("Enter Publisher Name: ");
            String Publisher = sc.nextLine();
            
            System.out.println("Enter Release Date (yyyy-mm-dd): ");
            String date = sc.nextLine();
            
            System.out.println("Enter Selling Price: ");
            int Price = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter Cost Price: ");
            int Cost_Price = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter Stock Quantity: ");
            int Stock_Quantity = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter Language: ");
            String Language = sc.nextLine();
            
            System.out.println("Enter Book Edition: ");
            String Edition = sc.nextLine();
            
            System.out.println("Enter Page Count: ");
            int Page_Count = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            System.out.println("Enter Book Format: ");
            String Book_Format = sc.nextLine();
            
            System.out.println("Enter Description: ");
            String Description = sc.nextLine();
            
            System.out.println("Enter Book Cover Image URL: ");
            String Book_Cover = sc.nextLine();
            
            pst.setString(1, Title);
            pst.setInt(2, Book_ID);
            pst.setString(3, Author);
            pst.setString(4, ISBN);
            pst.setString(5, Genre);
            pst.setString(6, Publisher);
            pst.setString(7, date);
            pst.setInt(8, Price);
            pst.setInt(9, Cost_Price);
            pst.setInt(10, Stock_Quantity);
            pst.setString(11, Language);
            pst.setString(12, Edition);
            pst.setInt(13, Page_Count);
            pst.setString(14, Book_Format);
            pst.setString(15, Description);
            pst.setString(16, Book_Cover);
            
            pst.executeUpdate();
            System.out.println("The values have been inserted successfully.");
            
        } catch (Exception e) {
            System.out.println("Error in Insertion: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        insert();
    }
}

