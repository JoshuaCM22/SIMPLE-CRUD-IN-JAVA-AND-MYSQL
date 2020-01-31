package Connection;
import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection con;
    private static DatabaseConnection dbc;

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("INITIALIZATION");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_students", "root", "562622");
            System.out.println("SUCCESSFULLY CONNECTED");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static DatabaseConnection getDatabaseConnection() {

        if (dbc == null) {
            dbc = new DatabaseConnection();
        }
        return dbc;
    }

    public Connection getConnection() {
        return con;
    }

}
