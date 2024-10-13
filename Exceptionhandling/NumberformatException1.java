package Exceptionhandling;

public class NumberformatException1 {
    public static void main(String[] args) {
        try{
            String name="hello";
            int b=Integer.parseInt(name);
            System.out.println(b);
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
            System.out.println("exception handle");
        }
        finally{
            System.out.println("always execute");
        }
    }
}
