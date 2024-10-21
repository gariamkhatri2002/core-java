import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=oc.nextInt();
        int num=1;
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
                System.out.print(num+" ");
                num++;
            }
            
            System.out.println();
        }
    }
}
