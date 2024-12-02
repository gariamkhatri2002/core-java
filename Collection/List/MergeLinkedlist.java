import java.util.LinkedList;

public class MergeLinkedlist {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList<>();
        ll.add(11);
        ll.add(12);
        ll.add(13);

        LinkedList ll1=new LinkedList<>(ll);
        ll1.add(14);
        ll1.add(15);
        ll1.add(16);

        System.out.println(ll1);
    }
}
