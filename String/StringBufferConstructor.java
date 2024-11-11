public class StringBufferConstructor {
    public static void main(String[] args) {
        //DEFAULT CONSTRUCTOR
        StringBuffer oc=new StringBuffer();
        System.out.println(oc);                      //NO OUTPUT
        

        //STRING LITERAL CONSTRUCTOR
        String name="garima";
        StringBuffer oc1=new StringBuffer(name);
        System.out.println(oc1);                    //GARIMA
        

        //STRING CAPACITY
        StringBuffer oc2=new StringBuffer(5);
        System.out.println(oc2.capacity());                    //5


    }
}
