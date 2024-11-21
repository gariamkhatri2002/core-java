

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int start=sc.nextInt();
        System.out.print("enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            while(num>0){
                sum=sum*10+(num%10);
                num=num/10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }

        }

    }
}
