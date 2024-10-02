import java.util.*;
public class MinElementinColumn {
    static void minimumelement(int a[][]){
        //FIND MINIMUM ELEMENT IN EACH COLUMN
        for(int i=0;i<a.length;i++){
            int min=a[0][i];
            for(int j=0;j<a[i].length;j++){
                if(min>a[j][i]){
                    min=a[j][i];
                }
            }
            System.out.println("minimum elemnet of column "+(i+1)+" : "+min);
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
        minimumelement(arr);
    }
}
