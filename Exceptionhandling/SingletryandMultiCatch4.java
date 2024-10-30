public class SingletryandMultiCatch4 {
    public static void main(String[] args) {
        try{
            int a=6;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception ex){
            System.out.println("exception handle");
        }
        catch(ArithmeticException ex){                //gives error
            System.out.println("arithmetic handle");
        }
    }
}
