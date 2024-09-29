import java.util.Scanner;

public class Transpose{
    //METHOD TO PRINT 2D ARRAY
    static void printarray(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    //TRANSPOSE 2D ARRAY WITHOUT SWAP
    static int[][] transposewithoutswap(int a[][]){
        int ans[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                ans[i][j]=a[j][i];
            }
        }
        return ans;
    }
    static void transposewithswap(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        printarray(a);
    }
    public static void main(String[] args) {
        //NO. OF INPUT IN 2D ARRAY
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of row:");         //INPUT SIZE FOR ROW AND COLUMN
        int row=oc.nextInt();
        System.out.print("Enter number of column:");
        int column=oc.nextInt();
        int a[][]=new int[row][column];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter "+column+" element of row "+(i+1)+" :");
            for(int j=0;j<a[i].length;j++){
                a[i][j]=oc.nextInt();
            }
        }
        System.out.println("Original array");
        printarray(a);
        System.out.println("transposewithoutswap array ");
        int ans[][]=transposewithoutswap(a);
        printarray(ans);
        System.out.println("transposewithswap array");
        transposewithswap(ans);

    }
}