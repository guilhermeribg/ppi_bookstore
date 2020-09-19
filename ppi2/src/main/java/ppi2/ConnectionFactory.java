package ppi2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	static String databaseName = "Bookstore";
    static String username = "root";
    static String password = "admin";
    static String url = "jdbc:mysql://localhost:3306/" + "Bookstore" + "?useTimezone=true&serverTimezone=UTC";

    // Conectar ao banco
    public static Connection getconnection() {

    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		return DriverManager.getConnection(url, username, password);
    	} catch (SQLException e) {
    		throw new RuntimeException(e);
    	} catch (ClassNotFoundException e) {
    		throw new RuntimeException(e);
    	}
    }

}