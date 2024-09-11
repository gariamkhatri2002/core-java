import java.util.*;
public class CountduplicateElement {
        static void duplicateelement(int arr[]){
            int count=0;
            
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        
                        System.out.print("duplicate element index:"+j+" ");
                    }
                }
                System.out.println();
                if(count>0){
                System.out.print(arr[i]+"total count of duplicate element:"+count);
                }
            }
        }
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.nextInt();
        }
        duplicateelement(arr);
    }
}

