class A{
    public synchronized void wish(String name){
        for(int i=1;i<=3;i++){
            System.out.println("good morning "+name);
            try{
                Thread.sleep(1000);
            }
            catch(Exception ex){
                System.out.println("got");
            }
        }
    }
}
class Mythread extends Thread{
    A p;
    String name;
    Mythread(A p,String name){
        this.p=p;
        this.name=name;
    }
    public void run(){
        p.wish(name);
    }
}
public class Synchronizedmethod {
    public static void main(String[] args) {
        A p=new A();
        Mythread t1=new Mythread(p, "garima");
        Mythread t2=new Mythread(p, "KOMAL");
        t1.start();
        t2.start();
    }
}
