import java.util.*;
import java.util.Arrays;
public class Binarysearch {
    static void sort(int a[]){
        int li=0;
        
        int hi=a.length-1;
        int mid=(li+hi)/2;
        int target=12;
        while(li<hi){
            if(a[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(a[mid]<target){
                li=mid+1;
            }
            else{
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("element not found");
        }
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
        Arrays.sort(a);
        sort(a);
    }
}

