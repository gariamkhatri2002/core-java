import java.util.Scanner;

public class Merge {
    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    static int[] merge(int a[],int b[]){
        int sizeofC=a.length+b.length;
        int c[]=new int[sizeofC];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i<c.length;i++){
            c[i]=b[i-a.length];
        }
        return c;
    }
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
		System.out.print("enter the size of array a:");
		int size=oc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
		    a[i]=oc.nextInt();
		}
		System.out.print("enter the size of array b:");
		int size1=oc.nextInt();
		int b[]=new int[size1];
		for(int i=0;i<b.length;i++){
		    b[i]=oc.nextInt();
		    
		}
		sort(a);
		sort(b);
		int c[]=merge(a,b);
		sort(c);
		display(a);
		System.out.println();
		display(b);
		System.out.println();
		display(c);
    }
}
