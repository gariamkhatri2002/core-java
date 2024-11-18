import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        
        String a[]=str.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++){
            count++;
        }
        System.out.println(count);
        
    }
}
