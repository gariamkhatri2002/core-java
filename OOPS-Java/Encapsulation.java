import java.util.*;
public class Encapsulation{
   
   private String name,fname,mname,gender,address;
   private int classname,rollno,marks;
   private long contact;
   void set(String name,String fname, String mname, String gender,String address,int classname,int rollno,int marks,long contact ){
    this.name=name;
    this.fname=fname;
    this.mname=mname;
    this.gender=gender;
    this.address=address;
    this.classname=classname;
    this.rollno=rollno;
    this.marks=marks;
    this.contact=contact;

   }
   String getname(){
    return name;
   } 
   String getfname(){
    return fname;
   } 
   String getmname(){
    return mname;
   }
   int getclass(){
    return classname;
   } 
   String getaddress(){
    return address;
   }
   long getcontact(){
    return contact;
   }
   int getrollno(){
    return rollno;
   }
   String getgender(){
    return gender;
   }
   int getmarks(){
    return marks;
   }
   

    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.print("Name:");
        String name=ob.nextLine();
        System.out.print("fatherName:");
        String fname=ob.nextLine();
        System.out.print("motherName:");
        String mname=ob.nextLine();
        System.out.print("classname:");
        int classname=ob.nextInt();
        ob.nextLine();
        System.out.print("address:");
        String address=ob.nextLine();
        System.out.print("contact:");
        long contact=ob.nextLong();
        System.out.print("rollno:");
        int rollno=ob.nextInt();
        System.out.print("gender:");
        String gender=ob.next();
        
        System.out.print("marks:");
        int marks=ob.nextInt();

        System.out.println();
        Encapsulation obj=new Encapsulation();
        obj.set(name, fname, mname, gender, address, classname, rollno, marks, contact);
        System.out.println(obj.getname());
        System.out.println(obj.getfname());
        System.out.println(obj.getmname());
        System.out.println(obj.getclass());
        System.out.println(obj.getaddress());
        System.out.println(obj.getcontact());
        System.out.println(obj.getrollno());
        System.out.println(obj.getgender());
        System.out.println(obj.getmarks());
        

    }
}