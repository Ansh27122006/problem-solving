package pauj.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

interface EmployeeDao{
    String addRecord(Integer eno, String ename, double esal) throws ClassNotFoundException, SQLException;
    String updateRecord(Integer eno, String ename, double esal) throws ClassNotFoundException, SQLException;
}
class EmployeeDaoImpl implements EmployeeDao{
    private Connection conn;
    private PreparedStatement pst;
    private String sql;
    public String addRecord(Integer eno, String ename, double esal) throws ClassNotFoundException, SQLException{
        conn=MyConnection.getConnection("mysql");
        sql="insert into employee values(?,?,?)";
        pst=conn.prepareStatement(sql);
        pst.setInt(1,eno);
        pst.setString(2,ename);
        pst.setDouble(3,esal);

        Integer count=pst.executeUpdate();
        return count+" Record Added";
    }
    public String updateRecord(Integer eno, String ename, double esal) throws ClassNotFoundException, SQLException{
        conn=MyConnection.getConnection("mysql");
        sql="update employee set ename=?, esal=? where eno=?";
        pst=conn.prepareStatement(sql);
        pst.setInt(3,eno);
        pst.setString(1,ename);
        pst.setDouble(2,esal);

        Integer count=pst.executeUpdate();
        return count+" Record Updated";
    }
}
public class DAODesignPattern{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Add Employee Data");
        System.out.println("Enter 2 to Modify Employee Data");
        System.out.print("Enter your choice: ");
        int n=sc.nextInt();
        System.out.println();

        if(n==1){
            System.out.println("Enter id:");
            int eno=sc.nextInt();
            System.out.println("Enter name:");
            String ename=sc.next();
            System.out.println("Enter salary:");
            double esal=sc.nextDouble();

            EmployeeDaoImpl dao = new EmployeeDaoImpl();
            System.out.println(dao.addRecord(eno,ename,esal));
        }else if(n==2){
            System.out.println("Enter id to update:");
            int eno=sc.nextInt();
            System.out.println("Enter name:");
            String ename=sc.next();
            System.out.println("Enter salary:");
            double esal=sc.nextDouble();

            EmployeeDaoImpl dao = new EmployeeDaoImpl();
            System.out.println(dao.updateRecord(eno,ename,esal));
        }else{
            System.out.println("Enter valid choice");
        }
    }
}
