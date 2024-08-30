import java.util.Scanner;

public class Evenoddinarray {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        int sumeven=0;
        int sumodd=0;
        for(int i=0;i<size;i++){
            System.out.print("Enter the element inside the array:");
            arr[i]=oc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                sumeven=sumeven+arr[i];
            }
        }
        System.out.println();
        System.out.println("sum of even numbers in array:"+sumeven);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.print(arr[i]+" ");
                sumodd=sumodd+arr[i];
            }
        }
        System.out.println();
        System.out.println("sum of odd numbers in array:"+sumodd);

    }
}
