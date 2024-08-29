public class Printarray {
    public static void main(String[] args) {
        //print array using for loop

        //all primitive data type
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println();
        float b[]={2.3f,45.2f,7.8f,6.9f};
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        char c[]={'o','r','w','l','p'};
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();

        boolean d[]={true,false,true,false,true};
        for(int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();
        long e[]={1254,7896,365,147866,2587413};
        for(int i=0;i<e.length;i++){
           System.out.print(e[i]+" ");

        }
        System.out.println();
        double f[]={23.145,546.789};
        for(int i=0;i<f.length;i++){
            System.out.print(f[i]+" ");
        }
        System.out.println();

        byte g[]={-78,58,123,-125};
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
        System.out.println();

        short h[]={4563,147,587,3654};
        for(int i=0;i<h.length;i++){
           System.out.print(h[i]+" ");
        }
        System.out.println();

        // print array using for each loop 
        // VAR
        var k=new Object[]{
            12,'u',2.3,"regex",true,123654,2.35469
        };
        for(var i:k){
            System.out.print(i+" ");
        }
        System.out.println();

        //OBJECT CLASS
        Object p[]={34,'p',96.45,"car",true};
        for(Object i:p){
            System.out.print(i+" ");
        }
        System.out.println();

        //STRING
        String o[]={"table","laptop","kajal","bus"};
        for(String i:o){
            System.out.print(i+" ");
        }

        
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int size=arr.length;
        System.out.println(size);
        System.out.println("first element of array"+arr[0]);
        System.out.println("mid elemnet of array:"+(size/2));
        System.out.println("last element of array:"+arr[9]);
        
        //PRINT {10,9,8,7,6,5,4,3,2,1}
        System.out.println("reverse of array element:");
        for(int i=(arr.length-1);i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //  PRINT {1,2,3,4,5,10,9,8,7,6}
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>arr.length/2-1;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

        // PRINT {5,4,3,2,1,6,7,8,9,10}
        for(int i=arr.length/2-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        } 
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //  PRINT {5,4,3,2,1,10,9,8,7,6}
        for(int i=arr.length/2-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>arr.length/2-1;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
