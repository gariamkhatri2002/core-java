import java.util.Scanner;

public class Neon {
    static void neonnumberinarray(int a[]){
        for(int i=0;i<a.length;i++){
            int square=a[i]*a[i];
            int temp=a[i];
            int sum=0,rem=0;
            while(square>0){
                rem=square%10;
                sum=sum+rem;
                square=square/10;
            }
            if(temp==sum){
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
        neonnumberinarray(arr);
    }
}
