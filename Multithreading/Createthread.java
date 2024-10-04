class Mythread extends Thread{   //convert mythread class into thread class through extends Thread
    public void run(){           //run is thread class method
        System.out.println("Welcome to India");
    }
}
public class Createthread {
    public static void main(String[] args) {
        Mythread oc=new Mythread();
        oc.start();         //thread class method call always through start() method---thread method call
        oc.run();           //normal method call
    } 
}
