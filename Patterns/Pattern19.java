import java.util.*;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=oc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*i +" ");
            }
            System.out.println();
        }
    }
}
