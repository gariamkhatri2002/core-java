
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child thread");
        }
    }
}
public class DiffBTstartADrun {
    
    public static void main(String[] args) {
        Mythread k=new Mythread();
        // k.start();          thread convert into active stage
        k.run();              // normal method of mythread class
        for(int i=0;i<5;i++){
            System.out.println("parent thread");
        }
    }
}
