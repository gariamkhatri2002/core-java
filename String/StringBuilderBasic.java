// Java StringBuffer class is used to create mutable (modifiable) String objects. 
public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("garima");
        System.out.println(sb);

        StringBuilder sc=new StringBuilder("khatri");
        
        sb.append(sc);                                  //OBJECT VALUES CAN BE CHANGED
        System.out.println(sb);
        sb=sb.append("java");                       //object reassign
        System.out.println(sb);
        
        final StringBuilder oc=new StringBuilder("komal");
        oc.append("khatria");                       // change object value
        System.out.println(oc);
        
        // oc=oc.append("java");                      //object is final we can not reassign the object value
        // System.out.println(oc);
        
         

    }
}
