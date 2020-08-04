// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
   public static void main(String[] args)
   {
      String name = "";
      displayGreeting();
   }


   public static String getName()
   {
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter name: " );
      //      System.out.println(name);
      return inputDevice.nextLine();



   }
   public static void displayGreeting()


   {
      String name = getName();
      System.out.println("Hello, " + name + "!");
   }
}
