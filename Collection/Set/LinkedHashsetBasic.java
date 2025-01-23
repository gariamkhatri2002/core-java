package Collection.Set;
import java.util.*;
public class LinkedHashsetBasic {
    public static void main(String[] args) {
        //non generic class
        LinkedHashSet lh=new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        System.out.println(lh.add(10));          //false 
        System.out.println(lh.add("komal"));     //true
        System.out.println(lh);

        //another way to print
        Iterator itr=lh.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        //with generic class
        LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
        lh1.add(1);
        lh1.add(2);
        lh1.add(3);
        lh1.add(4);
        lh1.add(5);
        //for each loop use only when create a generic class
        for(int p:lh1){
            System.out.print(p+" ");
        }
        
    }
}
