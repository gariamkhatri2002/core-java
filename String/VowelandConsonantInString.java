import java.util.Scanner;

public class VowelandConsonantInString {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=oc.nextLine();
        
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                if(a[i]=='a' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='e'){
                    System.out.print(a[i]+" ");
                }
                
            }
            
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                 if(a[i]!='a' ||a[i]!='i' ||a[i]!='o' ||a[i]!='u' ||a[i]!='e'){
                    System.out.print(a[i]+" ");
                }
            }
        }
        
 
    }
}
