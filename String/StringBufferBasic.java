//The StringBuffer class in Java is the same as String class except it is mutable.
public class StringBufferBasic {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("garima");
        System.out.println(sb);
        
        //it can be changed
        StringBuffer sc=new StringBuffer("komal");
        sc.append(sb);
        System.out.println(sc);
        
    }
}
