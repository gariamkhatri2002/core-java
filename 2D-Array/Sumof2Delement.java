import java.util.Scanner;

public class Sumof2Delement {
    static void printarray(int a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
                sum=sum+a[i][j];
            }
            System.out.println();
        }
        System.out.println("2D array element sum :"+sum);
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter number of row:");
        int row=oc.nextInt();
        System.out.print("enter number of column:");
        int column=oc.nextInt(); 
        int a[][]=new int[row][column];
        for(int i=0;i<row;i++){
            System.out.print("Enter "+column+" element of row "+(i+1)+":");
            for(int j=0;j<column;j++){
                a[i][j]=oc.nextInt();
            }
        }
        printarray(a);
    }
}
