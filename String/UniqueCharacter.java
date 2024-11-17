import java.util.Scanner;

public class UniqueCharacter {
    static void unique(char a[]){
        boolean insert[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            
            if(insert[i]==false){
                int count=0;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        insert[j]=true;
                        count++;
                    } 
                }
                if(count==0){
                    System.out.println(a[i]+" "+i);
                }
                
            }
            
            
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=oc.nextLine();
        char a[]=s.toCharArray();

        unique(a);

    }
}
