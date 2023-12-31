// Q.1 WAP to create connection to database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String user = "root";
            String pass = "root";
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connection established successfully.");
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE NGT";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully.");
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}