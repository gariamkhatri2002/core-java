import java.util.Scanner;

public class Primeinarray {
    static void prime(int a[]){
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=2;j<a[i];j++){
                if(a[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        prime(arr);
    }
}
