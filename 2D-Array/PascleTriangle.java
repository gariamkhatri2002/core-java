import java.util.*;
public class PascleTriangle {
    static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascle(int row){
        int a[][]=new int[row][];
        for(int i=0;i<row;i++){
            a[i]=new int[i+1];
            a[i][0]=a[i][i]=1;
            for(int j=1;j<i;j++){
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }


        }
        return a;
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int row=oc.nextInt();
        int arr[][]=pascle(row);
        display(arr);
    }
}
