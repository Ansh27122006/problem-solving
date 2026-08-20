package pauj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateIntoTable {
    static void update() throws ClassNotFoundException , SQLException{
        Scanner sc = new Scanner(System.in);
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="update employee set ename=?, esal=? where eno=?";

        Class.forName(driverName);
        Connection conn= DriverManager.getConnection(url, username, password);
        PreparedStatement pst=conn.prepareStatement(sql);

        System.out.println("Enter id to update:");
        int eno=sc.nextInt();
        System.out.println("Enter name:");
        String ename=sc.next();
        System.out.println("Enter salary:");
        double esal=sc.nextDouble();

        pst.setInt(3,eno);
        pst.setString(1,ename);
        pst.setDouble(2,esal);

        pst.executeUpdate();
        System.out.println("Record Updated");
        conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        update();
    }
}
