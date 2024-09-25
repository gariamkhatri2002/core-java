import java.util.*;
public class Maxin2DArray {
    static void maximum(int a[][]){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("Maximum element in 2D array:"+max);
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
        maximum(a);
    }
}
