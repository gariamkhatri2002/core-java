import java.util.Scanner;

public class SumofEachRow {
    static void sumofrow(int a[][]){
        
        for(int i=0;i<a.length;i++){
            int sum=0;
            //EACH ROW SUM
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                
            }
            //PRINT EACH ROW SUM
            System.out.println("sum of row "+(i+1)+":"+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //INPUT NUMBER OF SIZE THROUGH ROW AND COLUMN 
        System.out.print("Enter number of row:");
        int row=sc.nextInt();
        System.out.print("Enter number of column:");
        int column=sc.nextInt();
        //create an array
        int a[][]=new int[row][column];
        for(int i=0;i<a.length;i++){       //THIS LOOP FOR NUMBER OF ROW IN ARRAY A
            System.out.print("Enter "+column+" element of row "+(i+1)+":");    //THIS LOOP FOR ROW LENGTH IN ARRAY A
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
            
        }
        sumofrow(a);
    }
}
 