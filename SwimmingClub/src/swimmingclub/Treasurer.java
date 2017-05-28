
package swimmingclub;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;
import static swimmingclub.SwimmingClub.input;


public class Treasurer {
        static String coachPass = "abcd";
        static String chairmanPass = "abc";

    static Scanner input= new Scanner(System.in);
     public static void TreasureMenu() throws IOException, AWTException {
        System.out.println("\t\tWelcome to Treasure Menu");
        System.out.println("Select");
        System.out.println("1.Contingent Payment");
        System.out.println("2.Sign Out");
        int choice = input.nextInt();
        switch(choice){
            case 1: 
                contingentPayment();
                coach obj1=new coach();
                obj1.coachMenu();
                break;
            case 2: 
                 //String[] arr={};
                 //main(arr);
                break;
            default: System.out.println("Invalid Input"); break;
        }
        }

    private static void contingentPayment() throws IOException, AWTException {
     System.out.println("\t\tWelcome to Contingent Payment");
        System.out.println("Select");
        System.out.println("1.Passive");
        System.out.println("2.Active");
        System.out.println("3.Main Menu");
        int choice = input.nextInt();
        switch(choice){
            case 1: 
                System.out.println("For passive membership, the rate is DKK 500 ");
                contingentPayment();
                break;
            case 2: 
                System.out.println("For Active Membership");
                System.out.println("Youth Swimmers : 1000 Annually");
                System.out.println("Senior Swimmers : 1600 kr Annually");
                System.out.println("Above 60  : 25% Discount on Senior Ratings");
                contingentPayment();
                break;
            case 3: 
                
                //String[] arr={};
                //main(arr);
                break;
            default: System.out.println("Invalid Input"); break;
        }
        }
}
