import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the size:");
        int size=oc.nextInt();
        for(int i=1;i<=size;i++){
            int num=10;
            for(int j=1;j<=size;j++){
                if(i==j ||i==1 ||j==size){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print("   ");
                }
                num++;
            }
            System.out.println();
        }

    }
}
