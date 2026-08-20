package pauj.JDBC;
import java.sql.*;

public class ReadAllDataFromTable {
    static void list() throws ClassNotFoundException , SQLException{
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="select * from employee";

        Class.forName(driverName);
        Connection conn= DriverManager.getConnection(url, username, password);
        PreparedStatement pst=conn.prepareStatement(sql);

        ResultSet rs=pst.executeQuery();
        if(!rs.next()){
            System.out.println("Record not found");
        }else{
            do{
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("EName: "+rs.getString(2));
                System.out.println("ESalary: "+rs.getDouble(3));
                System.out.println();
            }while((rs.next()));
        }
        conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        list();
    }
}
