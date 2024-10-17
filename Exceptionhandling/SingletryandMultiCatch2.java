public class SingletryandMultiCatch2 {
    public static void main(String[] args) {
        try{
            int a=4/0;
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array index exception handle");
        }
        catch(ArithmeticException ex){
            System.out.println("arithmetic exception handle");
        }
    }
    
}
