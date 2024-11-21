import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int start=sc.nextInt();
        System.out.print("enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            for(int j=1;j<num;j++){
                if(num%j==0){
                    sum=sum+j;
                }
            }
            if(sum==num){
                System.out.println("perfect number:"+sum);
            }
           
        }
        
    }
}
