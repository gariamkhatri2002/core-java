import java.util.*;
public class Shallowcopy {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Enter elements inside the array:");
        for(int i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        int b[]=a;
        int c[]=b;
        int d[]=c;
        int e[]=d;
        printarray(a);
        printarray(b);
        printarray(c);
        printarray(d);
        printarray(e);
        System.out.println("after changes in array c");
        c[1]=500;
        c[3]=300;
        printarray(a);
        printarray(b);
        printarray(c);
        printarray(d);
        printarray(e);
    }
}
