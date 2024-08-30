import java.util.*;
public class Methodinarray {
    void displayA(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
    void displayF(float arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void displayC(char arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void displayL(long arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    void displayD(double arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void displayS(short arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void displayB(byte arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void displayk(boolean arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void displaySH(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner oc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        
        int size=oc.nextInt();
        Methodinarray k=new Methodinarray();
        //INT
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the int array element:");
            arr[i]=oc.nextInt();
            
        }
        
        k.displayA(arr);
        System.out.println(); 
        
        //FLOAT
        float arr1[]=new float[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the float array element:");
            arr1[i]=oc.nextFloat();

        }
        k.displayF(arr1);
        System.out.println();

        //CHAR
        char arr2[]=new char[size];
        
        for(int i=0;i<size;i++){
            System.out.print("enter the char array element:");
            arr2[i]=oc.next().charAt(0);
            
        }

        k.displayC(arr2);
        System.out.println();

        //LONG
        long arr3[]=new long[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the long array element:");
            arr3[i]=oc.nextLong();
        }
        k.displayL(arr3);
        System.out.println();

        //DOUBLE
        double arr4[]=new double[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the double array element:");
            arr4[i]=oc.nextDouble();
        }
        k.displayD(arr4);
        System.out.println();

        //SHORT
        short arr5[]=new short[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the short array element:");
            arr5[i]=oc.nextShort();
        }
        k.displayS(arr5);
        System.out.println();

        //BYTE
        byte arr6[]=new byte[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the byte array element:");
            arr6[i]=oc.nextByte();
        }
        k.displayB(arr6);
        System.out.println();
        
        //BOOLEAN
        boolean arr7[]=new boolean[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the boolean array element:");
            arr7[i]=oc.nextBoolean();
        }
        k.displayk(arr7);
        System.out.println();
        

        //STRING
        String arr8[]=new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the string array element:");
            arr8[i]=oc.next();
        }
        k.displaySH(arr8);
        System.out.println();
    }
}
