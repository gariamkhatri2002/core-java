package Collection.Set;
import java.util.*;
public class HashsetBasic {
    public static void main(String[] args) {
        HashSet<Integer> ll=new HashSet<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        System.out.print(ll);
        System.out.println();
        for(int i:ll){
            System.out.print(i+" ");
        }
    }
}
