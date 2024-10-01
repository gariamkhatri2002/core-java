import java.util.*;
public class Frequency {
    //FIND FREQUENCY OF EACH ELEMENT IN 2D ARRAY
    static void frequencyofelement(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("index of element "+arr[i][j]+" is :"+i+" "+j);

            }
        }
    }
    public static void main(String[] args) {
        //NO. OF INPUT FOR SIZE
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of rows:");     //FOR NUMBER OF ROWS
        int row=oc.nextInt();
        System.out.print("Enter number of columns:");   //FOR NUMBER OF COLUMNS
        int column=oc.nextInt();
        //DYNAMIC 2D ARRAY 
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            System.out.print("Enter "+column+" element of row "+(i+1)+": ");
            for(int j=0;j<column;j++){
                arr[i][j]=oc.nextInt();
            }
        }
        frequencyofelement(arr);

    }
}
