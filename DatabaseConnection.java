import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = ""; // Change this if your MySQL has a password
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Connection failed! " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        getConnection(); // Just for testing
    }
}
