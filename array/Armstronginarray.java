import java.util.*;
public class Armstronginarray {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=oc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element inside the array:");
            arr[i]=oc.nextInt();

        }
        for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        System.out.print("Armstrong number is:");
        for(int i=0;i<size;i++){
            int num=arr[i];
            int sum=0;
            int rem=0;
            int temp=num;
            while(num>0){
                rem=num%10;
                sum=sum+rem*rem*rem;
                num=num/10;
            }
            
            if(temp==sum){
                System.out.print(arr[i]+" ");
            }
        }
    }
}