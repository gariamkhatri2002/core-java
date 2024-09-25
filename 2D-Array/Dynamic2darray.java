import java.util.Scanner;

public class Dynamic2darray {
    static void printarray(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //2D-ARRAY THROUGH USER INPUT
        Scanner oc=new Scanner(System.in);
        //ROW
        System.out.print("enter number of row:");
        int row=oc.nextInt();
        //COLUMN
        System.out.println("enter number of column");
        int column=oc.nextInt();
        int a[][]=new int[row][column];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=oc.nextInt();
            }
        }
        printarray(a);
    }
}
