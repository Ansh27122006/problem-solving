package edu.cu.training.java.basics.Basic;

public class StudentClassTest {
    public static void main(String[] args) {
        Student s1=new Student(10,20);
        s1.show();
        Student s2=new Student(105,208);
        s2.show();
        Student s3 =new Student(200,103);
        s3.show();
        Student.showStatic();
    }
}
