
import java.util.*;
import java.util.Comparator;

   ///implements Comparable<Emergency>

public class Emergency{
    
   private int id;
   private String name;
   int range;
   private long time;
   public Emergency(int i, String p, int r, long rtime){
       this.id =i;
       this.name = p;
       this.range = r;
       this.time = rtime;
   }
   public Emergency(String pt){
      this.name = pt;
     }
   public long GetTime(){
      return id;
      }
 
   public int GetID(){
       return id;
   }
   public String GetName(){
       return name;
   }
   public int GetRange(){
      return range;
    }
   public void SetName(String Name){
      this.name = name;
   }
   
  // public int compareTo(Emergency er){
     // Emergency p = (Emergency) er;
      //return this.range - er.range;
     //    return Integer.compare(er.range, range);
      //} //use the interface method for compartor i used compartable in here so change this
         
        //Use comparator
         //Interface - a class that only contains a list of methods stubs 
 
            
           // -1 it returns -1 if  obj 1 is less than obj 2(obj 1 comes before object 2
             //0 if the same
             //+1 if obkect 1 comes after object 2
          
      
      }
 