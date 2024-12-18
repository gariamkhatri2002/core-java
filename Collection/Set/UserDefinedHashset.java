package Collection.Set;
import java.util.*;
class A{
    int a;
    String name;

    A(int a,String name){
        this.a=a;
        this.name=name;
    }
}
public class UserDefinedHashset {

    public static void main(String[] args) {
        A p=new A(10, "hello");
        
        A o=new A(11, "world");
        HashSet<A> hs=new HashSet<>();
        hs.add(p);
        hs.add(o);
        for(A t:hs){
            System.out.print(t.a+" "+t.name);
            System.out.println();
        }
        
        
    }
}
