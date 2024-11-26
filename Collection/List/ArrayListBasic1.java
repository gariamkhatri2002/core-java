import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic1 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the size:");
        int size=oc.nextInt();

        ArrayList al=new ArrayList<>();
        for(int i=0;i<size;i++){
            al.add(oc.nextInt());
        }

        //PRINTING ARRAYLIST THROUGH LOOP  
        // WITH GET() METHOD

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
}
