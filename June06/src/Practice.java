import java.util.*;
import java.util.Map.Entry;

public class Practice {
   public static void main(String args[]) {
   // create hash map
   HashMap newmap = new HashMap();
      
   // populate hash map
   newmap.put(1, "tutorials");
   newmap.put(2, "point");
   newmap.put(3, "is best");
      
   // create set view for the map
   Set set=newmap.entrySet();
      
   // check set values
   System.out.println("Set values: " + set);
   
   Iterator <Entry> ite=set.iterator();
   
   while(ite.hasNext())
   {
	   Entry e=ite.next();
	   System.out.println(e.getKey() +" : "+e.getValue());
	   
   }
   }    
}