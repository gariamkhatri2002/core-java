import java.util.Scanner;

public class RotateElement {
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] rotate(int a[]){
            int n=3;
            for(int i=0;i<n;i++){
                for(int j=0;j<a.length;j++){
                    swap(a, j,a.length-1);
                
                }
                    
            }
            return a;
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=oc.nextInt();
        System.out.print("enter the element:");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=oc.nextInt();
        }
        int arr[]=rotate(a);
        printArray(arr);
    }
}
