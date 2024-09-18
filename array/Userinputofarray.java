import java.util.Scanner;
import java.util.Arrays;
public class Userinputofarray {
    static void sort(int array[]){
        int first=array[0];
        int mid=array.length/2;
        int last=array[array.length-1];
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("first element:"+first);
        System.out.println("mid element:"+mid);
        System.out.println("last element:"+last);
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            // System.out.print("enter the element:");
            arr[i]=oc.nextInt();
            
        }
        Arrays.sort(arr);
        sort(arr);
        
    }
}
