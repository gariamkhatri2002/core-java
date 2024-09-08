import java.util.Scanner;

public class Counttotalpairsinarray {
    static void counttotalpair(int arr[]){
        int count=0;
        int target=12;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                    System.out.println("two numbers whose addition are equal to target:"+arr[i]+" "+arr[j]);
                    System.out.println("and their index:"+i+" "+j);
                }
            }
        }
        System.out.println("total pairs whose addition 12:-"+count);
    }

    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.nextInt();
        }
        counttotalpair(arr);

        
    }
}
