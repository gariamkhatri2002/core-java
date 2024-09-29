import java.util.Scanner;
class A{
    A show(int a){
        System.out.println("Class A method " + a);
        return this;

    }
}
class B extends A{
    B show(int a){
        Scanner sc= new Scanner(System.in);
        System.out.print("argument for class A: ");
        super.show(sc.nextInt());
        System.out.println("Class B method " + a);
        return this;
    }
}
class C extends A{
    C show(int a){
        Scanner sc= new Scanner(System.in);
        System.out.print("argument for class A: ");
        super.show(sc.nextInt());
        System.out.println("Class C method " + a);
        return this;
    }
}

public class Polymorphism{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        B obB= new B();
        System.out.print("argument for class B: ");
        obB.show(sc.nextInt());
        C obC= new C();
        System.out.print("argument for class C: ");
        obC.show(sc.nextInt());
    }
}