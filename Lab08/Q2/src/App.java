// Q.2 WAP to create table named Student.

import java.sql.Connection;
import java.sql.DriverManager;
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
            String sql = "CREATE TABLE STUDENT (Id INT NOT NULL, Name VARCHAR(255), Class VARCHAR(255), RollNo INT, PRIMARY KEY (Id))";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully.");
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}