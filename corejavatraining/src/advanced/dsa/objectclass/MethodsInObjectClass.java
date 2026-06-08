package advanced.dsa.objectclass;

class Student{
    int rollNo;
    public Student(int rollNo){
        this.rollNo=rollNo;
    }
    public Student(){}
    public void display(){
        System.out.println("Roll No is:"+rollNo);
    }
    @Override
    public String toString(){
        return "Student{Roll No: "+rollNo+"}";
    }
    @Override
    public boolean equals(Object obj){
        return this.rollNo==((Student)obj).rollNo;
    }
}
public class MethodsInObjectClass {
    public static void main(String[] args) {
        Student s1=new Student(10);
        Student s2=new Student(10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
//        System.out.println(Student);            //Error
    }
}
