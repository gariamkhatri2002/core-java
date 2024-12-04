import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the size:");
        int size=oc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<size;i++){
            al.add(oc.nextInt());
        }
        for(int i=0;i<al.size();i++){
            int num=al.get(i);
            int rem=0,sum=0;
            int temp=num;
            while(num>0){
                rem=num%10;
                sum=sum+rem*rem*rem;
                num=num/10;
            }
            if(temp==sum){
                System.out.print(sum+" ");
            }
        }
        

    }
}
