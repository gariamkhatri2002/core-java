import java.util.Scanner;

public class MinIn2dArray {
    static void min_element(int a[][]){
        int min=a[0][0];                  //first index value store in min
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(min>a[i][j]){           //if min value greater than a[i][j] value then min is equal to a[i][j]
                    min=a[i][j];
                }
            }
        }
        System.out.print("minimum element :"+min);

    }
    public static void main(String[] args) {
        //NO. OF INPUT FOR SIZE IN ROW AND COLUMN
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row=oc.nextInt();
        System.out.print("Enter number of columns:");
        int column=oc.nextInt();
        int a[][]=new int[row][column];
        //INSERT THE VALUES IN ROW AND COLUMN FORMAT
        for(int i=0;i<row;i++){
            System.out.print("Enter "+column+" element of row "+(i+1)+": ");
            for(int j=0;j<column;j++){
                a[i][j]=oc.nextInt();
            }
        }
        min_element(a);
    }
}
