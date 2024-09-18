import java.util.Scanner;

public class ZeroOnesorting {
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void sortzero(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
           
        }
        for(int i=0;i<a.length;i++){
            if(i<count){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
            
        }
        display(a);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=ob.nextInt();
        System.out.print("Enter the element:");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=ob.nextInt();
        }
        sortzero(a);
    }
}
