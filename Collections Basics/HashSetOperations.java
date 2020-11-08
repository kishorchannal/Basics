/*
 * 1. create
 * 2. add elements
 * 3. remove elements
 * 4. traverse
 * 5. set and get: these are not possible as ordering is not maintained.
 * 6. clear
 */

import java.util.*;
public class HashSetOperations {

	public static void main(String[] args) {
		
		//1. create 
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//2. add elements
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);	//duplicates are not allowed, will not be reflected 
		hs.add(60);
		
		System.out.println("HashSet: "+hs);
		
		//3. remove: always takes object, as it does not maintain the order 
		
		hs.remove(40);
		System.out.println("HashSet after removing 40: "+hs); 		//even though we had added 40 twice, it wont be added at all
		
		//4. traverse 
		
//		for(int i=0; i<hs.size(); i++) {			//since it does not maintain order, we cannot access it by index
//			System.out.println(hs.get(i));
//		}
		for(Integer i : hs) {
			System.out.println(i);
		}
		System.out.println();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.clear();
		System.out.println("\n HashSet after clearing: "+hs);
		
		
	}

}
