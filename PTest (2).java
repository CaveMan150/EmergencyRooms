import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

public class PTest {
   
   
   
   public static void main(String[] args) {
     
      
       
         PTest obj = new PTest();
         obj.NewPatient();
         
         
      }
   // public setPriority(){
      /*Use comparator
         Interface - a class that only contains a list of methods stubs 
         int compare (obj 1, obj 2){
            -1 it returns -1 if  obj 1 is less than obj 2(obj 1 comes before object 2
             0 if the same
             +1 if obkect 1 comes after object 2
      */
     
    public void NewPatient(){
    //PriorityQueue<Emergency> patient = new PriorityQueue<>(4, new sortByPriority());
 
  
      String s;
      char num;
      int defultCap = 2;
      int Addpatient = 0;
      PriorityQueue<Emergency> patient = new PriorityQueue<>(defultCap, new sortByPriority());
      
      boolean start = true;
      
      int injury_Range = 000;
         do{
            try{
               Random ran = new Random();
               int ID = ran.nextInt((10000000 - 1000000 )+1) + 1;
               
                  
               System.out.println("A: Add Patient");
               System.out.println();
               System.out.println("L: To print Priority list ");
               System.out.println();
               System.out.println("R: To Remove patient");
               System.out.println();
               System.out.println("Q: Quit");
               Scanner str = new Scanner(System.in);
               num = str.next().charAt(0);
               if(num =='A'){
                  long the_time = ((System.currentTimeMillis()- System.currentTimeMillis() / 1000));
                  Addpatient = Addpatient + 1;
                  defultCap = Addpatient;
                  
                  
                  System.out.println("Enter Patient Name:");
                  Scanner in = new Scanner(System.in);
                  s = in.nextLine();
                  System.out.println("Enter the range if injury 000-999");
                  Scanner rng = new Scanner(System.in);
                  injury_Range = rng.nextInt();
                  patient.add(new Emergency(ID , s,injury_Range, the_time));
                  
                }
         
               
               if(num == 'Q'){
                    System.out.println("Good Bye !");
                    start = false;
                    System.exit(0);
                    }
               if (num == 'L'){/// Get the most important patient that need to be taken care of RIGHT AWAY
                     PriorityQueue<Emergency> priority = new PriorityQueue<>(Addpatient, new sortByPriority());
                     priority.addAll(patient);
                     Emergency [] mostPrior = new Emergency[Addpatient];///declaring an array of emergencies!
                     priority.toArray(mostPrior);// making an array of patients!
                     Arrays.sort(priority.toArray(mostPrior), Collections.reverseOrder(new sortByPriority()));//// Sorting patients up!
                     
                     if(Addpatient == 0){
                     System.out.println("There are no patients currently on the list add patients first then come back!");
                     System.out.println();
                     }
                     
                    
                      System.out.println("This is a list of The most prior and need to be taken care of ASAP Patients");
                     
                     for (int i = 0 ; i < mostPrior.length; i++){
                     try{
                        
                        System.out.println();
                     
                    
                        System.out.println("Patient Name:"+mostPrior[i].GetName()+" |Patient ID: "+ mostPrior[i].GetID() +"  |Patient Range of injury: "+ mostPrior[i].GetRange()+" The Time of check in "+ mostPrior[i].GetTime()+ " <--");
                      }catch (NullPointerException e){
                        System.out.println(" Oops! something went wrong! ");
                        }
                        
                    }
                    
                    }
                                        
                 if(num == 'R'){
                 
                     if(Addpatient == 0){
                     System.out.println("There are no patients to remove!");
                     System.out.println();
                     }
                    
                    
                    patient.poll();
                    Emergency removed = patient.poll();

                    
                  
                  }
                  }catch(InputMismatchException e){
             
                     System.out.println("What are doing?");
                     System.out.println();
                     System.out.println("Please enter a letter to choose from the menue:");
                     }
                   
            
          }while(start == true);
 
      
    
    }
    }
    