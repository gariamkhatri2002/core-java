import java.util.*;
public class Larg_SmllSuminRow{
    //THIS METHOD CREATE TO FIND LARGEST SUM IN EACH ROW SUM
    static void sumofrow(int a[][]){
        int larg_sum=0;
        
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            System.out.println("sum of row "+(i+1)+":"+sum);
            if(larg_sum<sum){     //IF SUM IS GREATER THAN LARGEST SUM THEN THE LARGEST SUM BECOMES EQUAL TO THE SUM
                larg_sum=sum;     //AND IT'S CHECK TILL OUTER LOOP RUN
            }

        }
        min_sum(a, larg_sum);      //CALL MINIMUM SUM METHOD AND PASS THE ARRAY AND LARGEST SUM VALUES AS ARGUMENT
        System.out.println("largest sum is:"+larg_sum);
    }
    static void min_sum(int a[][],int max){  //TO FIND THE MINIMUM SUM
        int smll_sum=max;                         //MINIMUM SUM EQUAL TO MAXMIMUM SUM
        
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];          //TO EACH ROW SUM
            }
            if(smll_sum>sum){          //IF MINIMUM SUM IS GREATER THAN SUM THEN THE MINIMUM SUM EBCOMES EQUAL TO THE SUM
                smll_sum=sum;
            }
        }
        System.out.println("Smallest sum is:"+smll_sum);
    }
    public static void main(String[] args) {
        //NO. OF ROW AND COLUMN
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row=oc.nextInt();
        System.out.print("Enter number of columns:");
        int column=oc.nextInt();
        int arr[][]=new int[row][column];
        
        for(int i=0;i<row;i++){
            System.out.print("Enter "+column+" element of row "+(i+1)+" :");
            for(int j=0;j<column;j++){
                arr[i][j]=oc.nextInt();
            }
        }
        sumofrow(arr);
    }
}
