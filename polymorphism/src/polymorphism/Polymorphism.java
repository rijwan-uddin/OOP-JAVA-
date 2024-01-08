
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
        person p=new person();
        p.display();
        
         p=new teacher();
         p.display();
         
         p=new student();
         p.display();
       
    }
    
}
