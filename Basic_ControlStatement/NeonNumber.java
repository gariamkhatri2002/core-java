import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int start=sc.nextInt();
        System.out.print("enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int square=i*i;
            int sum=0;
            
            while(square>0){
                sum+=(square%10);
                square/=10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }
        }
    }
}
