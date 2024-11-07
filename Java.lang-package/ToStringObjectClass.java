import java.util.Scanner;
import java.lang.Package;

//int convert into the string as a object
public class ToStringObjectClass {
    int a;
    ToStringObjectClass(int a){
        this.a=a;
    }
    public String toString(){
        return a+" ";
    }
    public static void main(String[] args) {
        ToStringObjectClass oc=new ToStringObjectClass(89);
        System.out.println(oc.toString());
    }
}
