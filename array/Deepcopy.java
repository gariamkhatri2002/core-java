import java.util.*;
public class Deepcopy {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //DEEP COPY
        Scanner ob=new Scanner(System.in);
        int a[]=new int[5];
        System.out.print("Enter elements inside the array:");
        for(int i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        int b[]=a.clone();
        int c[]=b.clone();
        int d[]=c.clone();
        int e[]=d.clone();
        printarray(a);
        printarray(b);
        printarray(c);
        printarray(d);
        printarray(e);
        System.out.println("after changes in array e");
        e[1]=550;
        e[3]=330;
        printarray(a);
        printarray(b);
        printarray(c);
        printarray(d);
        printarray(e);
    }
}
