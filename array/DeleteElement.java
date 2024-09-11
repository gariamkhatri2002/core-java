import java.util.Scanner;

public class DeleteElement {
    static void Delete(int arr[]){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<2;i++){
            System.out.print("Enter the index:");
            int index=sc.nextInt();
            arr[index]=-1;
            
        }
            
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
            
        }

    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the element:");
        for(int i=0;i<arr.length;i++){
            
            arr[i]=oc.nextInt();
        }
        Delete(arr);
    }
}
