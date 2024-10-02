import java.util.*;
public class Max_MinInEachrow {
    //FIND MAXIMUM AND MINIMUM ELEMENT IN EACH ROW
    static void maxinrow(int a[][]){
        //THIS LOOP FOR ROW
        for(int i=0;i<a.length;i++){
            int max=a[i][0];
            for(int j=0;j<a[i].length;j++){        //THIS J LOOP FOR COLUMN AND FIND MAXIMUM ELEMENT IN ROW
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
            System.out.println("maximum element in row "+(i+1)+" : "+max);
            int min=a[i][0];
            for(int j=0;j<a[i].length;j++){      //THIS J LOOP FOR COLUMN AND FIND MINIMUM ELEMENT IN ROW
                if(min>a[i][j]){
                    min=a[i][j];
                }
            }
            System.out.println("minimum element in row "+(i+1)+" : "+min);

        }
    }
    public static void main(String[] args) {
        //NO. OF INPUT FOR SIZE 
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of row:");
        int row=oc.nextInt();
        System.out.print("Enter number of column:");
        int column=oc.nextInt();
        int a[][]=new int[row][column];
        for(int i=0;i<row;i++){                  //this loop for number of rows
            System.out.print("Enter "+column+" element of row "+(i+1)+":");
            for(int j=0;j<column;j++){          //this loop for enter the element in array
                a[i][j]=oc.nextInt();
            }
        }
        maxinrow(a);
        
    }
}
