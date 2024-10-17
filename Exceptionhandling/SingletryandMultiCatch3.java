public class SingletryandMultiCatch3 {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);

        }
        catch(Exception ex){
            System.out.println("exception handle");
        }
        catch(Throwable ex){
            System.out.println("trowable handle");
        }
    }
}
