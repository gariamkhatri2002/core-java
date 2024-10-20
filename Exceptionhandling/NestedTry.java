package Exceptionhandling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name);
            try{
                int a=4/0;
                System.out.println(a);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
    }
}
