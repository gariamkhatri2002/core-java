import java.util.*;
public class Secondmaxinarray {
    static void maximum(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max:"+max);
        int secondmax=0;
        for(int i=0;i<a.length;i++){
           if(a[i]!=max){
            if(a[i]>secondmax){
                secondmax=a[i];
            }
           }
        }
        System.out.println(secondmax);
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
        maximum(a);
    }
}
