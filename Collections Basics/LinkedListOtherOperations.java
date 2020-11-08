/*
 * 1. sort, 2. compare, 3. join 4. listterator, 5. trimToSize, 6. conversion from other collections
 */

import java.util.*;
public class LinkedListOtherOperations {

	public static void main(String[] args) {
		LinkedList<String> city = new LinkedList<>();
		city.add("Delhi");
		city.add("Benagluru");
		city.add("Mumbai");
		city.add("Kolkata");
		city.add("Chennai");
		city.add("Punjab");
		
		System.out.println("Before sorting: "+city);
		Collections.sort(city);
		System.out.println("After sorting: "+city);
		
		
		/*compare 
		 * 
		 */
		
		//3. join two LinkedList
		LinkedList<String> names = new LinkedList<>();
		names.add("Micjel");
		names.add("Ron");
		names.add("Emili");
		names.add("Christan");
		names.add("Jonny");
		
		System.out.println("\n Before joining two LinkedLists: "+city);
		city.addAll(names);
		System.out.println("After joining two LinkedLists: "+city);
//		
//		
//		//4. listIterator: is not printing
//		ListIterator li = names.listIterator();
//		System.out.println("\n Iterating in reverse order :");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
		
		//5. TrimToSize: dosent work
//		city.trimToSize();
		
		//6. Conversion from other collections to LikedList
		ArrayList<String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		
		LinkedList<String> list = new LinkedList<>(al);
		for(String str : list) {
			System.out.println(str);
		}
		
		HashSet<String> hs = new HashSet<>();
		hs.add("apple");
		hs.add("mango");
		hs.add("watermelon");
		hs.add("apple"); //wont be added nor throws exception
		
		System.out.println("\n "+hs);
		
		LinkedList<String> list2 = new LinkedList<>(hs);
		for(String str2 : list2) {
			System.out.println(str2);
		}
		
	}
}


