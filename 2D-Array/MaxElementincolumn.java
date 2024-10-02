import java.util.Scanner;

public class MaxElementincolumn {
    static void largestelement(int a[][]){
        for(int i=0;i<a.length;i++){
            int larg=a[0][i];
            for(int j=0;j<a[i].length;j++){
                if(larg<a[j][i]){
                    larg=a[j][i];
                }
            }
            System.out.println(larg);
        }
    }
    public static void main(String[] args) {
        //NO. OF INPUT FOR SIZE 
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of row:");
        int row=oc.nextInt();
        System.out.print("Enter number of column:");
        int column=oc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){                  //this loop for number of rows
            System.out.print("Enter "+column+" element of row "+(i+1)+":");
            for(int j=0;j<column;j++){          //this loop for enter the element in array
                arr[i][j]=oc.nextInt();
            }
        }
        largestelement(arr);
    }
}
