import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='l'){
                continue;
            }
            System.out.print(a[i]);
        }

    }
}
