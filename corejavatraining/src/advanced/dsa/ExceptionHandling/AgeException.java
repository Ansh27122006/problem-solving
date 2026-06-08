package advanced.dsa.ExceptionHandling;

public class AgeException extends Exception{
    String message;
    public AgeException(){
        message="Age is less than equal to zero";
        message+="\nthis error is contributed by angel and aman";
    }public AgeException(String message){
       this.message=message;
    }
    public String toString(){
        return message;
    }
}
