
package swimmingclub;

import java.awt.AWTException;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import static swimmingclub.SwimmingClub.main;


public class chairman {
    static String chairmanPass = "abc";
    static Scanner input= new Scanner(System.in);
     public static void chairmanMenu() throws IOException, AWTException
   {
       Scanner input=new Scanner(System.in);
       System.out.println("1.Register Swimmers");
        System.out.println("2.Display ");
        System.out.println("3.Sign out");
        
       System.out.println("Enter your choice");
       int docchoice=input.nextInt();
       switch(docchoice)
       {
           case 1:
           {
             System.out.println("Registration Section");
             register();
             chairmanMenu();
             
              break;
              
           }
           
            case 2:{
               System.out.println("Display Record");
               D_displayreports();
             chairmanMenu();
            break;   
           }
            case 3:{
               System.out.println("Signout");
         
             String[]c= new String[1];
             main(c);
             
            break;   
           }
           default :
           {
               System.out.println("Wrong input try again");
               chairmanMenu();
           }
       }
 
}
 public static void register() throws IOException{
      Scanner input=new Scanner(System.in);
     
    
   
   //    int count=0;
long pointer=0,p=0;
String name,fname,mebership,group,cat,disp3,disp2,disp1;

         File a=new File("reports.txt");
          if(!a.exists())
        	  a.createNewFile();
            
           try (RandomAccessFile output = new  RandomAccessFile("reports.txt","rw")) {
               output.seek(output.length());
            
               System.out.println("Enter Name");
               name=input.nextLine();
               output.writeUTF(name);
               System.out.println("Enter Father name");
               fname=input.nextLine();
               output.writeUTF(fname);
               System.out.println("Enter Membership (Active or Passive) ");
               mebership=input.nextLine();
               output.writeUTF(mebership);
               
               System.out.println("Enter Group (under 18 or Adult) ");
               group=input.nextLine();
               output.writeUTF(group);
               
               System.out.println("Enter Category (Exerciseist or Competitor)");
               cat=input.nextLine();
               output.writeUTF(cat);
               
               System.out.println("Enter the Discipline 1");
               disp1=input.nextLine();
               output.writeUTF(disp1);
               System.out.println("Enter the Discipline 2");
               disp2=input.nextLine();
               output.writeUTF(disp2);
               System.out.println("Enter the Discipline 3");
               disp3=input.nextLine();
               output.writeUTF(disp3);
               output.close();
           }
 
      
       
               }
 
 
 
 public static void D_displayreports()throws AWTException, FileNotFoundException,IOException,EOFException{
 
         
        File bb=new File("reports.txt");
    if(!bb.exists())
  	  bb.createNewFile();
	try(RandomAccessFile input=new RandomAccessFile("reports.txt","r")){
          
    	while(input.getFilePointer()<input.length()){
         System.out.println("------------------------------------");
         System.out.println("NAME : " +input.readUTF() );
         System.out.println("FATHER NAME : "+input.readUTF() );
         System.out.println("Membership : " +input.readUTF() );
         System.out.println("Group: " +input.readUTF());
         System.out.println("Category: " +input.readUTF());
         System.out.println("Discipline 1: " +input.readUTF());
         System.out.println("Discipline 2:" +input.readUTF());
         System.out.println("Discipline 3: " +input.readUTF());
    	 System.out.println("------------------------------------");
    	 
    	
    	 
 	    		}
    	
    	
            }
}
}
