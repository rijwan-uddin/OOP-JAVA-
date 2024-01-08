
package inheritance3inputtake;
import java.util.Scanner;

public class nagad extends payment{
    Scanner sc=new Scanner(System.in);
    String ammount;
    
    void nagadvaluetake(){
        System.out.println("name:");
        name=sc.nextLine();
        System.out.println("id:");
        id=sc.nextLine();
        System.out.println("ammount:");
        ammount=sc.nextLine();
    }
    void printvalue(){
    print();
    System.out.println("ammount:"+ammount);
 
    
    }
}
