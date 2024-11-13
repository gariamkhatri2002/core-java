public class StringBufferMethods {
    public static void main(String[] args) {
        //1.length()
        StringBuffer s=new StringBuffer("hello");
        System.out.println(s.length());

        //2.capacity()
        StringBuffer s1=new StringBuffer("hello");
        System.out.println(s1.capacity());

        //3.charAt()
        StringBuffer s2=new StringBuffer("hello");
        System.out.println(s2.charAt(3));

        //4.append()
        StringBuffer s3=new StringBuffer("hello");
        System.out.println(s3.append("world"));

        //5.insert()
        StringBuffer s4=new StringBuffer("hello");
        System.out.println(s4.insert(2, 'Q'));

        //6.delete()
        StringBuffer s5=new StringBuffer("hello");
        System.out.println(s5.delete(1, 3));

        //7.deletechatat()
        StringBuffer s6=new StringBuffer("hello");
        System.out.println(s6.deleteCharAt(3));

        //8.reverse()
        StringBuffer s7=new StringBuffer("hello");
        System.out.println(s7.reverse());

        //9.setlength()
        StringBuffer s8=new StringBuffer("hello");
        s8.setLength(5);
        System.out.println(s8);

        //10.trimtosize()
        StringBuffer s9=new StringBuffer("  hello      ");
        s9.trimToSize();
        System.out.println(s9);

        /*OUTPUT:-
        5
        21
l       helloworld
        heQllo
        hlo
        helo
        olleh
        hello
          hello */
    }
}
