package pauj.JDBC;

import java.sql.*;
import java.util.Scanner;

public class ReadFromTable {
    static void search() throws ClassNotFoundException , SQLException{
        Scanner sc = new Scanner(System.in);
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="select * from employee where eno=?";

        Class.forName(driverName);
        Connection conn= DriverManager.getConnection(url, username, password);
        PreparedStatement pst=conn.prepareStatement(sql);

        boolean cont=true;
        while(cont){
            System.out.println("Enter id to search:");
            int eno=sc.nextInt();

            pst.setInt(1,eno);

            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("EName: "+rs.getString(2));
                System.out.println("ESalary: "+rs.getDouble(3));
            }else {
                System.out.println("Record not found");
            }

            System.out.println("Do you want to search more record y/n:");
            String ch = sc.next();

            if(ch.toLowerCase().equals("n")) cont=false;
        }
        conn.close();
    }
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        search();
    }
}
