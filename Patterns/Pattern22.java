import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            int num=5;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
