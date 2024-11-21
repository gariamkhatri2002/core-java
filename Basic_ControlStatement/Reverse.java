import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=oc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum*10+(num%10);
            num=num/10;

        }
        System.out.println("reverse:"+sum);
    }
}
