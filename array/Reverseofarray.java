public class Reverseofarray {
    static void reversearray(int[] arr,int sp,int ep){
        while (sp<ep) {
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
        
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        //starting point
        int sp=2;
        //ending point
        int ep=7;
        reversearray(arr, sp, ep);
        }
}
