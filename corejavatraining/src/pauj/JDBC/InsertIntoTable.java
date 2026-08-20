package pauj.JDBC;

import java.sql.*;
import java.util.Scanner;

public class InsertIntoTable {
    static void insert() throws ClassNotFoundException , SQLException{
        Scanner sc = new Scanner(System.in);
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="insert into employee values(?,?,?)";

        Class.forName(driverName);
        Connection conn= DriverManager.getConnection(url, username, password);
        PreparedStatement pst=conn.prepareStatement(sql);

        System.out.println("Enter no. of records to enter:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter id:");
            int eno=sc.nextInt();
            System.out.println("Enter name:");
            String ename=sc.next();
            System.out.println("Enter salary:");
            double esal=sc.nextDouble();

            pst.setInt(1,eno);
            pst.setString(2,ename);
            pst.setDouble(3,esal);

            pst.executeUpdate();
            System.out.println("Record"+i+" Added");
        }
        conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException , SQLException{
        insert();
    }
}
