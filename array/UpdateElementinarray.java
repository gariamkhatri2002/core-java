import java.util.Scanner;

public class UpdateElementinarray {
    static int[] updateelement(int arr[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the index:");
            int index=sc.nextInt();
            if(index<arr.length){
               System.out.print("Enter the value :");
               arr[index]=sc.nextInt();
            }
            else{
                System.out.println("Index not found");
            }
        
        return arr;
    }

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=oc.nextInt();
        }
        int a[]=updateelement(arr);
        display(a);
    }
}
