class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("child thread");
        }
    }
}

public class ThreadSchedular {
    //first call main thread then call other thread 
    public static void main(String[] args) {
        Mythread k=new Mythread();
        k.start();
        for(int i=1;i<=3;i++){
            System.out.println("main thread");
        }
    }
}
