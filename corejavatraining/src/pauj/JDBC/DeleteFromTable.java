package pauj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteFromTable {
    static void remove() throws ClassNotFoundException , SQLException{
        Scanner sc = new Scanner(System.in);
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="delete from employee where eno=?";

        Class.forName(driverName);
        Connection conn= DriverManager.getConnection(url, username, password);
        PreparedStatement pst=conn.prepareStatement(sql);

        System.out.println("Enter id to delete:");
        int eno=sc.nextInt();

        pst.setInt(1,eno);

        pst.executeUpdate();
        System.out.println("Record Deleted");
        conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        remove();
    }
}
