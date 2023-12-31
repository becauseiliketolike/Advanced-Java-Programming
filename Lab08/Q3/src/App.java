// Q.3 WAP to perform CRUD operation to table Student. (4 Different Programs)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/NGT";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // a. CREATE
            // String sql = "INSERT INTO student (Id, Name, Class, RollNo) VALUES (1, 'Jude', 'BCA', 5)";
            // statement.executeUpdate(sql);
            // sql = "INSERT INTO student VALUES (2, 'NGT', 'CSIT', 20)";
            // statement.executeUpdate(sql);
            // sql = "INSERT INTO student VALUES (3, 'Neymar', 'BBM', 10)";
            // statement.executeUpdate(sql);
            // System.out.println("Data inserted successfully.");
            
            // b. READ
            // String sql = "SELECT * FROM student";
            // ResultSet rs = statement.executeQuery(sql);
            // while (rs.next()) {
            //     int id = rs.getInt("Id");
            //     String name = rs.getString("Name");
            //     String classL = rs.getString("Class");
            //     int rollNo = rs.getInt("RollNo");
            //     System.out.println("| Id: " + id + "\t| First: " + name + "\t| Last: " + classL + "\t| Age: " + rollNo + "\t|");
            // }
            // rs.close();

            // c. UPDATE
            // String sql = "UPDATE student SET Name = 'Zidane' WHERE Id = 1";
            // statement.executeUpdate(sql);
            // System.out.println("Table Updated");

            // d. DELETE
            // String sql = "DELETE FROM student WHERE Id = 2";
            // statement.executeUpdate(sql);
            // System.out.println("Data deleted successfully.");
            
            connection.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}