//It returns an integer value which represents hashCode value for this Method.
public class Hashcode_Method {
    int a;
    Hashcode_Method(int a){
        this.a=a;
    }
    public int hashcode(){
        return a;
    }
    public static void main(String[] args) {
        Hashcode_Method sc=new Hashcode_Method(30);
        System.out.println(sc.hashCode());
    }
}
