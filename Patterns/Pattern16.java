import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int num=0;
        for(int i=1;i<=size;i++){
            num=i;
            for(int j=1;j<=size;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
