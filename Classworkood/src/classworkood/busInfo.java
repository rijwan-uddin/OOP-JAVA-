
package classworkood;
import java.util.Scanner;

public class busInfo extends vehiclee{
   Scanner sc=new Scanner(System.in);
   int seatNumber;
    
    void valueTake(){
    System.out.println("carmodel: ");
    carmodel=sc.nextLine();
    System.out.println("carprice: ");
    carprice=sc.nextLine();
    System.out.println("cartype: ");
    cartype=sc.nextLine();
    System.out.println("manufacture:");
    manufacture=sc.nextLine();
    System.out.println("country: ");
    country=sc.nextLine();
    System.out.println("seatNumber:");
    seatNumber=sc.nextInt();
    }
    
    void busInformation(){
    System.out.println("carmodel:"+carmodel);
    System.out.println("carprice:"+carprice);
    System.out.println("cartype:"+cartype);
    System.out.println("manufacture:"+manufacture);
    System.out.println("country:"+country);
    System.out.println("seatNumber:"+seatNumber);
    
    
    }
}










/*package classwork
import java .util.scanner;
publi class bus extends vehiclee{
scanner sc=new scanner(system.in);
int seat number;


 void takevalue(){
System.out.println("carmodel: ");
carmodel sc=nextline();
}
void info(){
System.out.println("carmodel: "+carmodel);
}
}


package classwork;
public class;
public static void main(string[] args){
System.out.println("bus info:");
bus bs=new bus;
bs.takevalue();
bs.info();

}
*/

























