import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        for(int i=5;i>0;i--){
            for(int s=4;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
