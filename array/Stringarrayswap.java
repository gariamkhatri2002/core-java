import java.util.Scanner;

public class Stringarrayswap {
    static void swap(String element[]){
        for(int i=0;i<element.length;i++){
            System.out.print(element[i]+" ");
        }
        System.out.println();
        String temp;
        temp=element[0];
        element[0]=element[element.length-1];
        element[element.length-1]=temp;
        for(int j=0;j<element.length;j++){
            System.out.print(element[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=object.nextInt();
        String arrayelement[]=new String[size];
        for(int i=0;i<size;i++){
            arrayelement[i]=object.next();
            
        }
        swap(arrayelement);
    }
}
