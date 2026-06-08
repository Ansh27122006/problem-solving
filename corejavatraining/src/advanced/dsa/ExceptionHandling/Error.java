package advanced.dsa.ExceptionHandling;

public class Error {
    public static void main (String[] args) throws Exception{
            int age=-1;
            if(age>0){
                System.out.println(age);
            }else{
                throw new AgeException();
            }
    }
}
