import java.util.Scanner;

public class Targetelemnetinarray {
    static int targetelement(int arr_element[]){
        Scanner oc=new Scanner(System.in);
        int target=oc.nextInt();
        int count=0;
        int first_position=0,last_position=0;
        for(int i=0;i<arr_element.length;i++){
            if(arr_element[i]==target){
                first_position=i;
                break;
            }
        }
        for(int i=0;i<arr_element.length;i++){
            if(arr_element[i]==target){
                last_position=i;
                count++;
            }
        }
        System.out.println("target element first position:"+first_position);
        System.out.println("target element last position:"+last_position);
        System.out.print("target element total count:");
        return count;

    }
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=object.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=object.nextInt();
        }
        System.out.println(targetelement(arr));
    }
}
