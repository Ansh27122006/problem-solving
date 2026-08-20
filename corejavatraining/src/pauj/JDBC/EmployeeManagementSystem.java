package pauj.JDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to Add Employee Data");
            System.out.println("Enter 2 to Modify Employee Data");
            System.out.println("Enter 3 to Remove Employee Data");
            System.out.println("Enter 4 to Find Employee Data");
            System.out.println("Enter 5 to To list all Employees");
            System.out.println("Enter 6 to Exit");
            System.out.print("Enter your choice: ");
            int n=sc.nextInt();
            System.out.println();

            if(n==1){
                InsertIntoTable in = new InsertIntoTable();
                in.insert();
            }else if(n==2){
                UpdateIntoTable up = new UpdateIntoTable();
                up.update();
            }else if(n==3){
                DeleteFromTable dl = new DeleteFromTable();
                dl.remove();
            }else if(n==4){
                ReadFromTable read = new ReadFromTable();
                read.search();
            }else if(n==5){
                ReadAllDataFromTable read = new ReadAllDataFromTable();
                read.list();
            }else if(n==6){
                System.out.println("Thank you for using our system");
                System.out.println("Existing.....");
                break;
            }else{
                System.out.println("Please Enter valid no.");
            }
            System.out.println();
        }
    }
}
