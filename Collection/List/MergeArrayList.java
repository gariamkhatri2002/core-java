import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);

        ArrayList<Integer> al1=new ArrayList<>(al);
        al1.add(4);
        al1.add(5);
        al1.add(6);

        System.out.print(al1);
    }
}
