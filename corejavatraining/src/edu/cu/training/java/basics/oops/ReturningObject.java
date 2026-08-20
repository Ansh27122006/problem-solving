package edu.cu.training.java.basics.oops;

class Book{
    String name;
    String author;
    public Book(String name,String author){
        super();
        this.name=name;
        this.author=author;
    }
    void display(){
        System.out.println(name+" "+author);
    }
}
class Library{
    Book newBook(String name,String author){
        Book book=new Book(name,author);
        return book;
    }
}
public class ReturningObject {
    public static void main(String[] args) {
        Library CSE=new Library();
        Book b1=CSE.newBook("java","Sweta");
        b1.display();
    }
}
