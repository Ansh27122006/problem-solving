package advanced.dsa.ComparableAndComparator;

import java.util.Comparator;

class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(int marks, String name){

    }
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
//    public int compareTo(Student s){
//        return this.name.compareTo(s.name);
//    }
}
class SortByMarks implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.marks - b.marks;
    }
}
public class Example {

}
