public class Stringcreation {
    public static void main(String[] args) {
        //CREATE STRING
        String s="garima";                           //constant way
        System.out.println(s);

        String sc=new String("garima");             //dynamic way
        System.out.println(sc);
        
        //STRING IS IMMUTABLE CAN NOT CHANGE STRING
        String p="hello";
        p.concat(s);
        System.out.println(p);

        p=p.concat(s);
        System.out.println(p);    //can not change string here object value is reassign

        
    }
}
