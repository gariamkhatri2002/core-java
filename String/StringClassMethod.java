public class StringClassMethod{
    public static void main(String[] args) {
        //1.CHARAT() METHOD
        //The String class charAt() method returns a character at specified index.
        String s="garima";
        System.out.println(s.charAt(4));              //m

        // char a=s.charAt(8);
        // System.out.println(a);                        //java.lang.StringIndexOutOfBoundsException

        

        // 2.CONCAT() METHOD
        String sc="garima";
        sc=sc.concat("khatri");
        System.out.println(sc);                         //garimakhatri
        


        // 3.EQUALS()
        //The equals() method's main goal is to compare the contents of two strings.  
        String s1=new String("garima");
        String s2="GARIMA";
        String s3="garima";
        System.out.println(s1.equals(s2));              //false   do not ignore upper case
        System.out.println(s1.equals(s3));              //true   .equals match content
        System.out.println(s1==s2);                     //false  == match address
        

        // 4.equalsignorecase()
        String s4="GARIMA";
        System.out.println(s4.equalsIgnoreCase("garima"));              //true--->ignore upper case and lower case 


        // 5.substring()
        //If the end argument is not specified then the substring will end at the end of the string.
        String s5="regex is a learning platform";
        System.out.println(s5.substring(7));           //7 is a starting       output-->s a learning platform

        System.out.println(s5.substring(4,15));       //4 is starting and 15 is ending index       output-->x is a lear


        // 6.length()
        // returns the length of a specified string.
        String s6=new String("garima");
        System.out.println(s6.length());                     //6


        // 7.replace()
        String s7="garima";
        s7=s7.replace('a','h');             //all "a" characters are replaced with "h" characters
        System.out.println(s7);                             //output-->ghrimh



        //8.tolowercase()
        String s8="GARIMA";
        System.out.println(s8.toLowerCase());              //garima

        //9.touppercase()
        String s9="garima";
        System.out.println(s9.toUpperCase());             //GARIMA

        //10.trim()
        //removes whitespace from both ends of a string
        String s10="           java is a programming language        ";
        System.out.println(s10.trim()+"software");                       //java is a programming languagesoftware



        //11.Indexof()
        String s11="garima";
        System.out.println(s11.indexOf('a'));                     //give  first index of character

        System.out.println(s11.lastIndexOf('a'));                 //give last index of character








    }
}
    

