
package inheritance3inputtake;
import java.util.Scanner;

public class bksh extends payment{
   Scanner sc=new Scanner(System.in);
   int pay;
   void bkshvaluetake(){
        System.out.println("name:");
        name=sc.nextLine();
        System.out.println("id:");
        id=sc.nextLine();
        System.out.println("pay:");
        pay=sc.nextInt();
    }
   void printvalue(){
    print();
    System.out.println("pay:"+pay);
 
    
    }
   
}
