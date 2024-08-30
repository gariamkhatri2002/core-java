import java.util.*;
public class Swaparrayelement {
        //WITH METHOD SWAP
        static void display(int arr[]){
            System.out.print("the array element before swap with method:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int temp;
            temp=arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=temp;
            System.out.print("the array element after swap with method:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        // first element swap last element

        //WITHOUT METHOD SWAP

        System.out.print("Enter the array1 size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element inside the array:");
            arr[i]=oc.nextInt();
        }
        System.out.print("the array element before swap without method:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp;
        temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.print("the array element after swap without method:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        // WITH METHOD SWAP
       
        System.out.print("Enter the array2 size:");
        int size2=oc.nextInt();
        int arr1[]=new int[size2];
        
        for(int i=0;i<size2;i++){
            System.out.print("Enter the element inside the array2:");
            arr1[i]=oc.nextInt();
        }
        //CALL METHOD
        Swaparrayelement.display(arr1);

        
    }
}
