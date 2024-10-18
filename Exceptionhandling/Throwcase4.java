public class Throwcase4 {
    public static void main(String[] args) {
        throw new ArithmeticException("hello");
        System.out.println("world");       //it's give unreachable statement
    }
}
