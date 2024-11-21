import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int start=sc.nextInt();
        System.out.print("enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int flag=0;
            
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }
}
