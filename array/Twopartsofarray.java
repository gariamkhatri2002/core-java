import java.util.Scanner;

public class Twopartsofarray {

    static void twopart(int arr[]){

        //FIRST PART SUM
        int firstpartsum=0;
        int flag=0;
        for(int i=0;i<arr.length/2;i++){
            
            firstpartsum=firstpartsum+arr[i];
        }
        System.out.println("array first half part sum:"+firstpartsum);
        for(int i=2;i<firstpartsum;i++){
            if(firstpartsum%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("array first half part sum is a prime number:");
        }
        else{
            System.out.println("array first half part sum is not a prime number");
        }

        //SECOND PART SUM
        int secondpartsum=0;
        for(int j=arr.length/2;j<arr.length;j++){
            secondpartsum=secondpartsum+arr[j];
        }
        System.out.println("array second half part sum:"+secondpartsum);
        int square=secondpartsum*secondpartsum;
        System.out.println(square);
        int sum=0,rem=0;
        while(square>0){
            rem=square%10;
            sum=sum+rem;
            
            square=square/10;
        }
        System.out.println(sum);
        if(secondpartsum==sum){
            System.out.println("array second part sum is a neon number");
        }
        else{
            System.out.println("array second part sum is not a neon number");
        }

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.nextInt();
        }
        twopart(arr);
    }
}
