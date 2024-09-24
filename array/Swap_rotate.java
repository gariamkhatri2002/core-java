import java.util.Scanner;

public class Swap_rotate {
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    static int[] rotatearray(int a[]){
        int rotate=3;
        for(int i=0;i<rotate;i++){
            swap(a,i,a.length-1-i);
        }
        return a;
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        printArray(a);
        System.out.println();
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
        rotatearray(a);
        
    }
}
