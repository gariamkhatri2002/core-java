import java.util.Scanner;

public class ValidParenthesis {
    static void countparenthesis(String s){
        char a[]=s.toCharArray();
        int countclose=0;
        int countopen=0;
        for(int i=0;i<s.length();i++){
            if(a[i]=='('){
                countopen++;
            }
            if(a[i]==')'){
                countclose++;
            }
        }
        if(countclose==countopen){
            System.out.print("valid parenthesis");
        }
        else{
            System.out.print("not valid parenthesis");
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=oc.nextLine();
        countparenthesis(s);
        
    }
}
