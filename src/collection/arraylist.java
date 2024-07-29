//To show the ArrayLsit.

package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Allow duplicate value
		// We can handle by index
		
		
		
        	List list=new ArrayList();	
		
        	list.add(20);
        	list.add(30);
        	list.add(-40);
        	list.add(50);
        	list.add('c');
        	list.add("Hulk");
        	list.add("tony");
        	list.add(80);
        	
        	
        	System.out.println(list);
        	
        	list.remove(3);         //Remove the specific value by index position
        
        	
        	System.out.println(list);
        	
          //	list.clear();          //clear all the list
        	
          //	System.out.println(list);
        	
        	list.add(0,10);
        	System.out.println(list);   //To add value by using index position
        
        	list.set(7, "Amrapali");     //set method used to replace 80 value by Amrapali using index method
        	System.out.println(list);
        	
  
        	int a=list.size();
        	System.out.println(a);
        	
        System.out.println(list.get(2));  // Show value by index position
        
        System.out.println(list.get(4));   // Show value by index position
        	
        	
        	
	}

}
