import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=oc.nextInt();
        for(int i=1;i<=size;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num*num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
