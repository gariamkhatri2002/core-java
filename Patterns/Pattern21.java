import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            int num=1;
            for(int j=1;j<=size;j++){
                
                if(i+j>size){
                    System.out.print(num);
                    num++;
                }
                else{   
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
