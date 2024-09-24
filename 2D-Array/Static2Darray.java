

public class Static2Darray {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8}};
        //this loop run length of array a
        for(int i=0;i<a.length;i++){
            //this loop run till length of array of a[i]
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
