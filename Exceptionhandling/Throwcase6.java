public class Throwcase6 extends Exception {
    public Throwcase6(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        try{
            throw new Throwcase6("garima");
        }
        catch(Exception ex){
            
        }
        
    }
}
