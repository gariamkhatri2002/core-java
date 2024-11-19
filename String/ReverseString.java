import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        
        
        String s[]=str.split(" ");

        
        for(int i=0;i<s.length;i++){
            // System.out.println(s[i]+" ");
            char a[]=s[i].toCharArray();
            for(int j=a.length-1;j>=0;j--){
                System.out.print(a[j]);
            }
            System.out.print(" ");
        }
    }
}
