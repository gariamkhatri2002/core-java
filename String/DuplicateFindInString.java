import java.util.Scanner;

public class DuplicateFindInString {
    static void duplicate(char a[]){
        boolean insert[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(insert[i]==false){
                int count=0;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        insert[j]=true;
                        count++;
                        System.out.print(j+" ");
                    }
                    
                }
                if(count>0){
                System.out.print(a[i]+" duplicate "+count+" times "+";");
            }
            
            }
            
            
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
	     System.out.print("Enter the String:");
	     String s=oc.nextLine();
	     char a[]=s.toCharArray();
	     
	     duplicate(a);
    }
}
