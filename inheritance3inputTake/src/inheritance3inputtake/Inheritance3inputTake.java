
package inheritance3inputtake;


public class Inheritance3inputTake {

 
    public static void main(String[] args) {
        System.out.println("bksh::\n");
        bksh b=new bksh();
        b.bkshvaluetake();
       
        
        System.out.println("nagad::\n");
        nagad n=new nagad();
        n.nagadvaluetake();
        
        b.printvalue();
        n.printvalue();
    }
    
}
