public class StringBuilderConstructor {
    public static void main(String[] args) {
        //DEFAULT CONSTRUCTOR
        StringBuilder oc=new StringBuilder();
        System.out.println(oc);                        //NO OUTPUT


        //STRING LITERAL CONSTRUCTOR
        String name="GARIMA";
        StringBuilder oc1=new StringBuilder(name);
        System.out.println(oc1);                       //GARIMA
    }
}
