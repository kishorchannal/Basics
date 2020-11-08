/*
 * 1. create
 * 2. add elements  put()
 * 3. get value()
 * 4. remove elements
 * 5. traverse
 * 6. isEmpty, size()
 * 7. clear
 */

import java.util.*;
public class HashMapBasicOperations {

	public static void main(String[] args) {
		//1. create = default 16
		HashMap<Integer,String> hm = new HashMap<>();
		//2. Add/put 
		
		hm.put(10,"Sachin");
		hm.put(18,"Virat");
		hm.put(7,"Dhoni");
		hm.put(5,"Dravid");
		hm.put(17,"Abd");
		hm.put(10, "Sunil");	//overrides the value if key is already present
		
		System.out.println("HashMap: "+hm);
		
		//3. get
		hm.get(18);	//will give output Virat 
		
		//4.remove
		hm.remove(17);	//takes object
		System.out.println("\n HashMap after removing 17: "+hm);
		
		/*5. Traverse through HashMap 
		 * 5.1. entrySet
		 * 5.2. for each loop | keySet()
		 * 5.3. forEach method
		 */
		//5.1
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry map = (Map.Entry)itr.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		//5.2
		for(Integer i : hm.keySet())
			System.out.println("key "+i);
		for(String str : hm.values())
			System.out.println("value "+str);
		
		//5.3
		hm.forEach((k,v) -> System.out.println(k+" "+v));
		
		//6.
		System.out.println("\n is HashMap Empty? "+hm.isEmpty());
		
		System.out.println("Size of HashMap "+hm.size());
		
		//7. Clear 
		hm.clear();
		System.out.println("\n is HashMap Empty? after clearing "+hm.isEmpty());
	}

}
