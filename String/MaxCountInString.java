import java.util.Scanner;

public class MaxCountInString {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=oc.nextLine();
        int vowel_count=0;
        int consonant_count1=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                if(a[i]=='a' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='e'){
                    vowel_count++;
                }
                else{
                    consonant_count1++;
                }
                
            }
            
        }
        if(vowel_count>consonant_count1){
            System.out.println("vowel count is max:"+vowel_count);
        }
        else{
            System.out.println("consonant count is max:"+consonant_count1);
        }
    }
}
