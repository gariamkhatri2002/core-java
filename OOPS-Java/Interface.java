
interface A{
    int show(int a);             //inside the interface method by default abstract and public 
    int print(String name);
}
interface C{
    void show();
    void print();
}
class B implements A,C{
    //define A interface method and defined with public keyword
    public int show(int a){
        System.out.print("interface A method show :");
        return a;
    }
    public int print(String name){
        System.out.println("interface A method print :"+name);
        return 0;
    }
    //define C interface method
    public void show(){
        System.out.println("interface B method show");
    }
    public void print(){
        System.out.println("interface B method print");
    }
    
}
public class Interface {
    public static void main(String[] args) {
        B oc=new B();
        System.out.println(oc.show(10));
        oc.print("regex");
        oc.show();
        oc.print();
    }
}
