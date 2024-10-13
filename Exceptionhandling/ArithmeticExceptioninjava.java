package Exceptionhandling;

public class ArithmeticExceptioninjava {
    public static void main(String[] args) {
        //try block is used to where code contain exception 
        try{
            int a=5;
            int b=0;
            System.out.println(a/b);    //dividing any number by zero give arithmetic exception
        }
        //catch block is used to solve the exception and ex is reference variable
        catch(ArithmeticException ex){
            System.out.println("exception handle");
        } 
        //finally block is always execute
        finally{
            System.out.println("always execute");
        }    
    }
    
}
