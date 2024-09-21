import java.util.*;
public class Linearsearch {
    static void display(int a[]){
        int target=4;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("element found in index:"+i);
            }
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
        display(a);
    }
}
