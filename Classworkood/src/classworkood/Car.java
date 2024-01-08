
package classworkood;

import java.util.Scanner;

public class Car extends vehiclee{
    Scanner sc=new Scanner(System.in);
     String privateCar;

void value(){
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
    System.out.println("privateCar: ");
    privateCar=sc.nextLine();
}
void carInfo()
{
    System.out.println("carmodel: "+carmodel);
    System.out.println("carprice: "+carprice);
    System.out.println("cartype: "+cartype);
    System.out.println("manufacture:"+manufacture);
    System.out.println("country: "+country);
    System.out.println("privateCar: "+privateCar);
}
}