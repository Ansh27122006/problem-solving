package adi.customSorting;

//sort students based on marks

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student s){
        return this.marks-s.marks;
    }

    @Override
    public String toString(){
        return this.name+": "+this.marks;
    }
}
public class SortStudentClass {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0]=new Student("student1",89);
        arr[1]=new Student("student2",90);
        arr[2]=new Student("student3",40);
        arr[3]=new Student("student4",78);
        arr[4]=new Student("student5",43);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Comparator<Student> c = (s1,s2)-> s2.marks-s1.marks;
        Arrays.sort(arr,c);
        System.out.println(Arrays.toString(arr));

        Comparator<Student> c2 = (s1,s2)-> s2.name.compareTo(s1.name);
        Arrays.sort(arr,c2);
        System.out.println(Arrays.toString(arr));
    }
}
