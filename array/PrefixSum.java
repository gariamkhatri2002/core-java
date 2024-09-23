import java.util.Scanner;
//prefix sum without using extra space
public class PrefixSum {
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix(int a[]){
        // int pre[]=new int[a.length];
        // pre[0]=a[0];
        for(int i=1;i<a.length;i++){
            a[i]=a[i-1]+a[i];
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=oc.nextInt();
        System.out.print("Enter the element:");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=oc.nextInt();
        }
        int pre_arr[]=prefix(a);
        display(pre_arr);

    }
}
