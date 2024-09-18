import java.util.Scanner;

public class Reversearrayelement {
    static void reverse(int arrayelement[]){
        for(int i=0;i<arrayelement.length;i++){
            int sum=0,rem=0;
            
            while(arrayelement[i]>0){
                rem=arrayelement[i]%10;
                sum=sum*10+rem;
                arrayelement[i]=arrayelement[i]/10;
            }
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=object.nextInt();
        int arrayelement[]=new int[size];
        for(int i=0;i<size;i++){
            arrayelement[i]=object.nextInt();
            
        }
        reverse(arrayelement);
    }
}
