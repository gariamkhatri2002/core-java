public class TwoPointer {
    static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void sortoddeven(int a[]){
        int left=0;
        int right=a.length-1;
        while(left<right){
            if(a[left]%2==1){
                left++;
            }
            else if(a[right]%2==0){
                right--;
            }
            else{
                swap(a,left,right);
                left++;
                right--;
            }
        }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        sortoddeven(a);
        display(a);
    }
}
