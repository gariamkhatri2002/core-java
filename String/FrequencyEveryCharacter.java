import java.util.Scanner;

public class FrequencyEveryCharacter {
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=oc.nextLine();
        char a[]=s.toCharArray();
        
        boolean b[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(b[i]==false){
                int count=1;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        b[j]=true;
                        count++;
                    }
                }
                System.out.println(a[i]+" "+count);
            }
        }
    }
}
