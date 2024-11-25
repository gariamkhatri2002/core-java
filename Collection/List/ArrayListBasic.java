import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic{
    public static void main(String[] args) {
        //HOW TO CREATE A ARRAYLIST
        Iterable al1=new ArrayList<>();
        // al1.add("interable");                      //only declare but element does not store

        Collection al2=new ArrayList<>();
        al2.add("collection");
        System.out.println(al2);                     //OUTPUT:[collection]

        List al3=new ArrayList<>();
        al3.add("list");
        System.out.println(al3);                    //OUTPUT:[list]

        ArrayList al=new ArrayList<>();           
        al.add("hello");
        al.add(39);
        al.add("garima");
        al.add(12.36);
        System.out.println(al);                      //OUTPUT:[hello,39,garima,12.36]

       
        Scanner oc=new Scanner(System.in);
        System.out.println("enter the arraylist size:");
        int size=oc.nextInt();
        
        //creating arraylist through user input
        ArrayList al4=new ArrayList<>();             //creating non generic class
        for(int i=0;i<size;i++){
            al4.add(oc.nextInt());
            // al4.add(oc.next());
        }

        System.out.println(al4);

        ArrayList<String> al5=new ArrayList<>();         //creating generic class
        for(int i=0;i<size;i++){
            // String x=oc.next();
            al5.add(oc.next());
        }
        System.out.println(al5);



    }
}