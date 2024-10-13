package Exceptionhandling;

public class Arrayindexoutofbound {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=20;
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("exception handle");
        }
        finally{
            System.out.println("always execute");
        }
    }
}
