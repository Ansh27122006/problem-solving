package advanced.dsa.classesAndObjects;
//abstract class
abstract class AbstractABC {
    int x=10;
    void display(){
        System.out.println("In Abc");
    }
    abstract void show();
}

public class ClassG1Abstract extends AbstractABC {
    int x=60;

    void show(){
        System.out.println("In Class G1");
    }

    void display(){
        System.out.println("In G1");
    }
//    In Class G1
//    60---------------why 60
//    In G1
//
//    In Class G1
//    10-------------why 10
//    In G1
    public static void main(String[] args) {
        AbstractABC abc =new ClassG1Abstract();
        ClassG1Abstract g1=new ClassG1Abstract();
        g1.show();
        System.out.println(g1.x);
        g1.display();
        System.out.println();

        abc.show();
        System.out.println(abc.x);
        abc.display();
    }
}
