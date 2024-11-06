

class A extends Thread{
    public void run(){                        //then run class A thread
        for(int i=1;i<=3;i++){                //it is work as a TS(thread schedular)
            Thread.yield();
            System.out.println("parent thread ");
        }
    }
}
public class MethodInThread1 {
    
    public static void main(String[] args) {
        A p=new A();
        p.start();
        for(int i=1;i<=3;i++){
            System.out.println("main thread");       //first run main thread 
        }
    }
}
