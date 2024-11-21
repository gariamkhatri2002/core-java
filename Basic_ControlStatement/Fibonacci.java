import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the last number:");
        int end=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=end;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        
    }
}
