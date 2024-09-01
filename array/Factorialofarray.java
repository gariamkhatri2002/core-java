import java.util.Scanner;

public class Factorialofarray {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        int fact=1;
        for(int i=0;i<size;i++){
            System.out.print("Enter the element inside the array:");
            arr[i]=oc.nextInt();

        }
        for(int i=0;i<size;i++){
            
            fact=fact*arr[i];
            
        }
        System.out.println("array elements factorial:"+fact);
       
    }

}
