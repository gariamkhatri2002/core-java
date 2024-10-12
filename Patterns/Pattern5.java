import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int n=oc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
