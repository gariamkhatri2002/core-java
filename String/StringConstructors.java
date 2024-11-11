public class StringConstructors {
    public static void main(String[] args) {
        //DEFAULT CONSTRUCTOR
        String oc=new String(); 
        System.out.println(oc);              //NO OUTPUT

        //STRING LITERAL
        String oc1=new String("garima");
        System.out.println(oc1);                     //garima
        //OR
        String name="regex";
        String sc=new String(name);
        System.out.println(sc);                     //regex


        //STRING BUFFER CONSTRUCTOR
        StringBuffer sb=new StringBuffer("string buffer");
        String oc3=new String(sb);
        System.out.println(oc3);                    //string buffer


        //STRING BUILDER CONSTRUCTOR
        StringBuilder sb1=new StringBuilder("string builder");
        String oc4=new String(sb1);
        System.out.println(oc4);                      //string builder

        //CHAR ARRAY CONSTRUCTOR
        char a[]={'a','b','c','d'};
        String oc5=new String(a);
        System.out.println(oc5);                     //abcd


        //BYTE ARRAY CONSTRUCTOR
        byte b[]={1,2,3,4,5,6,19};
        String oc6=new String(b);                         
        System.out.println(oc6);                     //☺☻♥♦♣♠‼
 

    }
}
