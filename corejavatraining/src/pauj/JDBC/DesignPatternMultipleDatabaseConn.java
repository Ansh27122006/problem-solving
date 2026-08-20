package pauj.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class MyConnection{
    private MyConnection(){}
    private static Connection conn;
    public static Connection getConnection(String database) throws ClassNotFoundException, SQLException {
        if(database.equalsIgnoreCase("mysql")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cu", "root", "1234");
        }else if(database.equalsIgnoreCase("oracle")){
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/cu", "root", "1234");
        }
        return conn;
    }
}
public class DesignPatternMultipleDatabaseConn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection conn = MyConnection.getConnection("mysql");
        System.out.println(conn);
    }
}
