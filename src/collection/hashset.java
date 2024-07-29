// To show HashSet

package collection;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Not allow duplicate value
		// We can not handle by index
		
		
	      Set list=new HashSet();
		
		list.add(10);
    	list.add(20);
    	list.add(-30);
    	list.add(20);
    	list.add('c');
    	list.add("Hulk");
    	list.add("Hulk");
    	list.add(80);
    	
    	
    	System.out.println(list);
    	
    	list.remove(30);         //Remove the specific value 
    
    	
    	System.out.println(list);
    	
      //	list.clear();          //clear all the list
    	
      //	System.out.println(list);
    	

    	    	
    System.out.println(list.contains(20));  // True if value is  is present otherwise flase 
    
    System.out.println(list.isEmpty());   // False  Check list is empty or not
    	
    System.out.println(list.size());     //  Give the size of list
		
		
		
	}

}
