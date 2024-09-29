abstract class A{
    int display(int n){
        System.out.println("This is method " + n);
        return 0;
    }
    abstract int show();
    void message(){
        System.out.println("Java is a programming language");
    }
    abstract void print();
    A greet(){
        System.out.println("Good morning!");
        return this;
    }
}

class B extends A{
    void anonymousInnerClassBlock(){
        A obj= new A(){
            int show(){
                System.out.println("Abstract class A method show");
                return 0;
            }
            void print(){
                System.out.println("Abstract class A method print");
            }
        };
        obj.display(1);
        obj.show();
        obj.message();
        obj.print();
        obj.greet();
    }

    int show(){
        System.out.println("Abstract class A method");
        return 0;
    }
    void print(){
        System.out.println("Empty method");
    }

}
public class Abstraction {
    public static void main(String[] args){
        B obj= new B();
        obj.anonymousInnerClassBlock();
        obj.show();
        obj.print();
    }
    
}
