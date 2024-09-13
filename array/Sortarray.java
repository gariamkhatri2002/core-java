//sort array using predefine method
import java.util.Arrays;
import java.util.Scanner;
public class Sortarray{
    public static void sort(int arr[]){
        int temp;
        temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=oc.nextInt();
        }
        Arrays.sort(arr);
        sort(arr);


    }
}
