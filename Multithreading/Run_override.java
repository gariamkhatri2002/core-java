class Mythread1 extends Thread{
    // can we run override the run method:-NO

    public void run(){
        System.out.println("Mythread1 class");
    }
}
class Mythread2 extends Mythread1{
    public void run(){
        System.out.println("Mythread2 class");
    }
}

public class Run_override {
    public static void main(String[] args) {
        Mythread2 p=new Mythread2();
        p.start();       //mythread2 thread method call
        p.run();        //mythread1 normal method
    }

}
