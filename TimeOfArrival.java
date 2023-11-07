import java.util.Scanner;
public class TimeOfArrival{
   public static void main (String [] args){
      Scanner bin = new Scanner(System.in);
      double cebuToMoalboal = 96.2; 
     
      //first destination is 41 mins
      System.out.println("Landmark : South Bus Terminal (Emall)");
      System.out.print("Your first destination/route 1: ");
      String des1  = bin.next(); 
      
      //second destination is 43 mins 
      System.out.print("Your second destinatio/route 2: ");
      String des2 = bin.next();
      System.out.print("Your third destination/route 3: ");
      String des3 = bin.next();
      System.out.print("Your fourth destination/route 4.2:");
      String des4 = bin.next();
      System.out.print("Your fifth destination/route 4.2.1:");
      String des5 = bin.next();
      System.out.print("Your sixth destination/route 4.2.2:");
      String des6 = bin.next();
      System.out.print("Your last destination :");
      String des7 = bin.next();
      System.out.print("Enter your Speed : ");
      int Speed = bin.nextInt();
      System.out.println("Total Distance = " + cebuToMoalboal);
      double toa , totDes; 
      totDes = 96.2;
      toa = totDes/Speed;
      System.out.print("Est. Time OF Arrival : "+toa);
     
   }
}