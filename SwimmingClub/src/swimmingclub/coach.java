
package swimmingclub;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import static swimmingclub.SwimmingClub.main;


public class coach{
     static String coachPass = "abcd";
    static Scanner input= new Scanner(System.in);
public static void coachMenu() throws IOException, AWTException {
        System.out.println("\t\tWelcome Coach");
        System.out.println("Select");
        System.out.println("1.Enter Training Result");
        System.out.println("2.Results");
        System.out.println("3.Sign Out");
        int choice = input.nextInt();
        switch(choice){
            case 1: 
                enterResult();
                coachMenu();
                break;
            case 2: 
                results();
                coachMenu();
                break;
                case 3: 
                    String[] arr={};
                main(arr);
                break;
            default: System.out.println("Invalid Input"); break;
        }
    }

    private static void enterResult() throws FileNotFoundException, IOException {
         Scanner in = new Scanner(System.in);
       
        File bb=new File("reports.txt");
        if(!bb.exists())
  	  bb.createNewFile();
	try(RandomAccessFile input=new RandomAccessFile("reports.txt","r")){
          
    	while(input.getFilePointer()<input.length()){
            
            String name =input.readUTF();
            String fname=input.readUTF();
            String membership =input.readUTF();
            String group=input.readUTF();
            String category =input.readUTF();
            String disp1=input.readUTF();
            String disp2=input.readUTF();
            String disp3=input.readUTF();
           System.out.println("Swimmer Name : "+name+", Group : "+group);
            
            System.out.print("Enter marks for Discipline "+disp1+" ");
            String marks1 = in.nextLine();
            System.out.print("Enter marks for Discipline "+disp2+" ");
            String marks2 = in.nextLine();
            System.out.print("Enter marks for Discipline "+disp3+" ");
            String marks3 = in.nextLine();
            
    	 
            
             File a=new File("DisciplineMarks.txt");
            if(!a.exists())
        	  a.createNewFile();
            
           try (RandomAccessFile output1 = new  RandomAccessFile("marksfile","rw")) {
               output1.seek(output1.length());
            
              
               output1.writeUTF(name);
              
               output1.writeUTF(marks1);
               
               output1.writeUTF(marks2);
               
               output1.writeUTF(marks3);
               
               
               output1.close();
           }
            
    	 
 	    		}
    	
    	
            }
        }

    private static void results() throws FileNotFoundException, IOException {
         Scanner in = new Scanner(System.in);
       
        File bb=new File("marksfile.txt");
        if(!bb.exists())
  	  bb.createNewFile();
	try(RandomAccessFile input=new RandomAccessFile("marksfile","r")){
          
    	while(input.getFilePointer()<input.length()){
            
            String name =input.readUTF();
            String marks1=input.readUTF();
            String marks2=input.readUTF();
            String marks3=input.readUTF();
           System.out.println("------------------------------------");
           System.out.println("Swimmer Name : "+name);
            System.out.println("Result");
           System.out.println("Discipline 1 : "+marks1);
           System.out.println("Discipline 2 : "+marks2);
           System.out.println("Discipline 3 : "+marks3);
           System.out.println("------------------------------------");
            
            
    	 
 	    		}
    	
    	
            }
        }  
    
}
