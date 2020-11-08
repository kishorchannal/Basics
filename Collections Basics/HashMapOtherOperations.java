/*
 * 1. keySet()
 * 2. values()
 * 3. containsKey() containsValue()
 * 4. entrySet()
 */
import java.util.*;
public class HashMapOtherOperations {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Messi");
		hm.put(7, "Pedro");
		hm.put(11, "Neymar");
		hm.put(9, "Suarez");
		hm.put(5, "Puyol");
		
		//1. keySet() gives set view of Keys
		System.out.println("Keys of HashMap: "+hm.keySet());
		
		//2. values() gives collection view of values in HashMap
		System.out.println("Collection is: "+hm.values());
		
		//3. containsKey() check if a particular key is present in HashMap
		System.out.println("is Key 6 present in HashMap? "+hm.containsKey(6));
		
		//containsValue() check if particular value is present in HashMap
		System.out.println("is value Xavi present in HashMap? "+hm.containsValue("Xavi"));
		
		//4. entrySet() gives set view of elements of HashMap
		System.out.println("HashMap: "+hm.entrySet());
		
		
		
		
	}

}
