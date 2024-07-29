package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We can put value in form of key and value
		// Duplicate value could be allowed
		
		Map map=new HashMap();
		
		map.put("Name", "Scarlett");
		map.put("Roll no",143 );
		map.put("Sub", "Fluid Dynamic");
		map.put("Mark", 94);
		map.put("Mark", 94);		
		
		System.out.println(map.get("Name"));  // provide key and  get value
		
		System.out.println(map.get("Roll no"));
		
		System.out.println(map.get("Sub"));
		
		System.out.println(map.get("Mark"));
		
		
		int a=map.size();
		System.out.println(a);      // size of list
	
		
	
		
	}

}
