package Exceptionhandling;

public class Nullpointer {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        }
        catch(NullPointerException ex){
            System.out.println("exception handle");
        }
        finally{
            System.out.println("always execute");
        }
    }
}
