import java.util.*;
public class SecondMinInArray{
    static void minimum(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min:"+min);
        int secondmin=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]!=min){
                if(a[i]<secondmin){
                    secondmin=a[i];
                }
            }
        }
        System.out.println(secondmin);
        
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
        minimum(a);
    }
}
