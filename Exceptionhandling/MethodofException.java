public class MethodofException {
    void show1(){
        try{
            int a=9/0;
            System.out.println(a);
        } 
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
    void show2(){
        try{
            int a=9/0;
            System.out.println(a);
        } 
        catch(ArithmeticException ex){
            ex.printStackTrace();;
        }
    }
    void show3(){
        try{
            int a=9/0;
            System.out.println(a);
        } 
        catch(ArithmeticException ex){
            System.out.println(ex.toString());
        }
    }
    void show4(){
        try{
            int a=9/0;
            System.out.println(a);
        } 
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        MethodofException oc=new MethodofException();
        oc.show1();
        oc.show2();
        oc.show3();
        oc.show4();
    }
}
