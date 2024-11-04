import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=oc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1 ||j==1 ||i==size ||j==size){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
