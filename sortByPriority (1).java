import java.util.Comparator;
import java.util.PriorityQueue;
class sortByPriority implements Comparator<Emergency>{
   //@Override
   public int compare(Emergency e1, Emergency e2){
            // -1 it returns -1 if  obj 1 is less than obj 2(obj 1 comes before object 2
             //0 if the same
             //+1 if obkect 1 comes after object 2
         if(e1.GetRange() < e2.GetRange()){
            return -1;
            }
         if(e1.GetRange() > e2.GetRange()){
            return 1;
           }
          else{
              return 0;
               }
 //     return Integer.compare(e2.GetRange(), e1.GetRange());
      }
     
    }