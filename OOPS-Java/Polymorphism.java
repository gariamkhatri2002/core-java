import java.util.Scanner;
class A{                           //different classes but method name same is method overriding
    A show(int a){
        System.out.println("Class A method "+a );
        return this;

    }
    //class same and method name also same is method overloading
    int add(){
        int a=10;                          //in this method zero parameter
        int b=20;
        System.out.print("addition of first method in class A:");
        return a+b;
    }
    String add(int a,int b){              //declare two parameter to solve overloading problem
        String name="Regex";
        System.out.print("additon of second method in class A :");
        System.out.println(a+b);
        System.out.print("class A String name: ");
        return name;
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
        System.out.println(obB.add());
        System.out.println(obB.add(50, 22));
    }
}