import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=oc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 ||j==n/2+1 ||i==1 && j>=n/2+1 ||j==1 && i<=n/2 ||j==n && i>=n/2+1 ||i==n && j<=n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
