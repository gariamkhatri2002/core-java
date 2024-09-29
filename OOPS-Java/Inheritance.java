class A{
    int a,b;
    void setadd(){
        int a=10,b=20;
        this.a=a;
        this.b=b;
            
    }
    void getadd(){
        System.out.println(a+b);
    }
}
class B extends A{
        void setsub(int a,int b){
            this.a=a;
            this.b=b;
        }
        void getsub(){
            System.out.println(a-b);
        }
        
}
    
class C extends B{
        void setdiv(){
            int a=12,b=2;
            this.a=a;
            this.b=b;
        }
        int getdiv(){
            return a/b;
        }
}
    
class D extends C{
        void setmulti(int a,int b){
            this.a=a;
            this.b=b;
        }
        int getmutli(){
            
            return a*b;
        }
}
public class Inheritance extends D{
        Inheritance name(String regex){
            System.out.println(regex);
            return this;
        }
        public static void main(String[] args){
               Inheritance ob=new Inheritance();
               ob.setadd();
               ob.getadd();
               ob.setsub(15, 10);
               ob.getsub();
               System.out.println("div:"+ob.getdiv());
               ob.setmulti(12, 2);
               System.out.println("multi:"+ob.getmutli());
               ob.name("garima");
        }
} 
    

