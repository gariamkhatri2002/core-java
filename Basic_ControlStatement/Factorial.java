
public class Factorial {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            int num=i;
            int fact=1;
            for(int j=1;j<=num;j++){
                fact=fact*j;
            }
            System.out.print(fact+" ");
        }
        
    }
}
