import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberInArrayList {
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
            int flag=0;
            for(int j=2;j<num;j++){
                if(num%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(num+" ");
            }
            
        }
    }
}
