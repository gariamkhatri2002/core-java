import java.util.Scanner;

public class Resizearray {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        
        Integer a[]=new Integer[5];
        for(int i=0;i<a.length;i++){
            a[i]=oc.nextInt();

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        a=new Integer[3];
        for(int i=0;i<a.length;i++){
            a[i]=oc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

