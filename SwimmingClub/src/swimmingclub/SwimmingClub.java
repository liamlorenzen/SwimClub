
package swimmingclub;

import java.awt.AWTException;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import static swimmingclub.SwimmingClub.main;


public class SwimmingClub {
    static Scanner input= new Scanner(System.in);
     
    
    
    
    public static void main(String[] args)throws IOException, AWTException {
        Scanner input=new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("--------------~ DELFINEN ~----------------");
        System.out.println("-----------The Swimming Club---------------");
        System.out.println("");
        System.out.println("Please Login!");
        System.out.println("");
        System.out.println(" 1.Chairman");
        System.out.println(" 2.Treasurer");
        System.out.println(" 3.Coach");
        System.out.println(" 4.exit");
       System.out.println("Enter your choice.....");
       int choice=input.nextInt();
       switch(choice)
       {
           case 1:
           {
             System.out.println("Welcome to Chairman Section");
             
              String pass, pass1;
        pass1 = "abc";
        
        Scanner key = new Scanner (System.in);
        System.out.println("\nEnter Password Please!!");
        pass = key.next();
        if(pass.equals(pass1))
        {
            System.out.println("\nWelcome Login Approved !!");
            chairman chobj=new chairman();
            chobj.chairmanMenu();
            //chairmanMenu();
        }
        else
        {
           System.out.println("\nWrong Password");
           
            String[]b= new String[1];
               main(b);  
        }
        
             
              break;
              
           }
           case 2:
           {
               System.out.println("Welcome to Treasure Section");
                String pass, pass1;
        pass1 = "abc";
        
        Scanner key = new Scanner (System.in);
        System.out.println("\nEnter Password Please!!");
        pass = key.next();
        if(pass.equals(pass1))
        {
            System.out.println("\nWelcome Login Approved !!");
            Treasurer tobj=new Treasurer();
            tobj.TreasureMenu();
        }
        else
        {
           System.out.println("\nWrong Password");
           String[]c= new String[1];
               main(c); 
        }
            
               break;
           }
           case 3:{
               System.out.println("Welcome to Coach Section");
               coach obj=new coach();
               obj.coachMenu();
               
               //coachMenu();
               String[]d= new String[1];
               main(d);
            break;   
           }
           case 4:{
        	   System.exit(0);
           }
           default :
           {
               System.out.println("Wrong input try again");
               
               String[]a= new String[1];
               main(a);
           }
       }
    }

    
    


   
    }

    
    

