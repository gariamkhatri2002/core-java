
class A extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){

            }
            
            System.out.print(i+" ");
        }
    }
}
public class MethodInThread2 {
    public static void main(String[] args) {
        A k=new A();
        A p=new A();
        k.start();
        p.start();
       
    }
}
