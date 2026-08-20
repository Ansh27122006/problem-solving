package pauj.JDBC;
import java.sql.*;

class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException ,SQLException {
        String driverName="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cu";
        String username="root";
        String password="1234";
        String sql="create table employee(eno int, ename varchar(20), esal double)";

        Class.forName(driverName);
        Connection conn=DriverManager.getConnection(url, username, password);
        Statement st=conn.createStatement();
        st.executeUpdate(sql);
        conn.close();
    }
}