import java.util.Scanner;

public class SumOfEachColumn {
    static void sumofcolumn(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                //for Each column sum
                sum=sum+arr[j][i];

            }
            System.out.println("sum of column "+(i+1)+":"+sum);
        }
    }
    
    public static void main(String[] args) {
        //FOR USER INPUT
        Scanner oc=new Scanner(System.in);
        //ARRAY SIZE THROUGH ROW AND COLUMN
        System.out.print("Enter number of rows:");         //USER INPUT FOR ROW
        int row=oc.nextInt();
        System.out.print("Enter number of columns:");     //USER INPUT FOR COLUMN
        int column=oc.nextInt();
        System.out.print("Enter the element:");
        int arr[][]=new int[row][column];                  //DECLARE 2D DYNAMIC ARRAY
        for(int i=0;i<row;i++){                           //OUTER LOOP FOR PUT ELEMENT IN ROW
            for(int j=0;j<column;j++){                    //INNER LOOP FOR PUT ELEMENT IN EACH ROW COLUMNS
                arr[i][j]=oc.nextInt();

            }
        }
        sumofcolumn(arr);
    }
}
