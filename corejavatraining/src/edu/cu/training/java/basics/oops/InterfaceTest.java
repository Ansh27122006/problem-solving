package edu.cu.training.java.basics.oops;

interface Vechile{
    default void start(){
        System.out.println("start");
    };
    static void stop(){
        System.out.println("STOP");
    };
    void breakV();
}
class Car implements Vechile{
    public void breakV() {
        System.out.println("Break");
    }
    public void carStop(){
        Vechile.stop();
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
        c1.carStop();
        Vechile.stop();
        c1.breakV();
    }
}
