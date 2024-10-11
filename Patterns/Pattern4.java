import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=oc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
