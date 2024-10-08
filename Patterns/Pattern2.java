import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter number of rows:");
        int n=oc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2-1;j++){
                if(i+j==n-1 ||j-i==n-1 ||j==(n*2-1)/2 ||i==n-1){
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
