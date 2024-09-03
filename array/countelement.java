import java.util.Scanner;

public class countelement {
    static int countarrayelement(int element[]){
        int totalelement=0;
        for(int i=0;i<element.length;i++){
            totalelement++;
            System.out.print(element[i]+" ");
        }
        System.out.println();
        System.out.print("total element inside the array is:");
        return totalelement;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=ob.nextInt();
        int element[]=new int[size];
        for(int i=0;i<size;i++){
            element[i]=ob.nextInt();
        }
        System.out.print(countarrayelement(element));
    }
}
