package advanced.dsa.classesAndObjects;
//interface I1{//functional interface
//    void display(int x);
//}
//public class AnonymsClass {
//    public static void main(String[] args) {
//        I1 abc=new I1(){
//            public void display(int x){
//                System.out.println(x+"Hello from anonymous class");
//            }
//        };
//        I1 abc2=(x)->{
//                System.out.println(x+"Hello from anonymous class with lambda syntax");
//        };
//        abc.display(1);
//        abc2.display(10);
//    }
//}
interface I1{//functional interface
    void display(int x);
    void hello();
    int y=10;
}
public class AnonymsClass {
    public static void main(String[] args) {
        I1 abc=new I1(){
            public void display(int x){
                System.out.println(x+"Hello from anonymous class");
            }
            public void hello(){
                System.out.println(y+"Hello");
            }
        };
//        I1 abc2=(x)->{        //error
//            System.out.println(x+"Hello from anonymous class with lambda syntax");
//        };
        abc.display(1);
        abc.hello();
//        abc2.display(10);
    }
}