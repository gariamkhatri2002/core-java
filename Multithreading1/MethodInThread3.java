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
class B extends Thread{
    public void run(){
        for(int i=4;i<=7;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){

            }
            System.out.print(i+" ");
        }
    }
}
public class MethodInThread3 {
    public static void main(String[] args) {
        A p=new A();
        p.start();
        A k=new A();
        k.start();
        try{
            k.join();

        }
        catch(InterruptedException ex){

        }
        B b=new B();
        b.start();
        B s=new B();
        s.start();

    }
}
