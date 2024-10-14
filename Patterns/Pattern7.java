import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row=oc.nextInt();
        char alpha='A';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row*2)-1;j++){
                if(i+j==row+1 ||j-i==row-1 ||i==row){
                    System.out.print(alpha+" ");
                    alpha++;
                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

