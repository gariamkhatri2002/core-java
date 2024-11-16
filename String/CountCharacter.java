import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=oc.nextLine();
        
        char a[]=s.toCharArray();
        int count=0;
        for(int i=0;i<a.length;i++){
            count++;
        }
        System.out.print(count);

    }
}
