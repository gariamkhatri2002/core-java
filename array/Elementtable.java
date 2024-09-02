import java.util.Scanner;

public class Elementtable {
    static void arrayelementtable(int a[]){
        for(int i=0;i<a.length;i++){
            int table;
            for(int j=1;j<=10;j++){
                table=a[i]*j;
                System.out.print(table+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        arrayelementtable(arr);
    }
}
