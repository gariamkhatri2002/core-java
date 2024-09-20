import java.util.Scanner;

public class SortArraythroughuserdefined{
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void sorting(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
        }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
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
        sorting(a);
        display(a);
    }
}