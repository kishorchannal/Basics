/*
 * Basic Operations:
 * 1. create LinkedList
 * 2. add elements 		| we can add elements first 
 * 3. remove elements 	| we can poll elements from first
 * 4. traverse list
 * 5. size of list
 * 6. set and get methods 
 * 6. clear the list
 */


import java.util.*;
public class LinkedListBasicOperations {

	public static void main(String[] args) {
		//1. create linkedlist
		
		LinkedList<String> names = new LinkedList<>();
		
		//2. adding elements
		names.add("John");	// same as addlast()
		names.add("Harry");
		names.add("Rues");
		names.add("Michel");
		names.addFirst("Rooney");
		
		System.out.println("After adding to list: "+names);
		
		//3. remove elements
		names.remove(0);			//removing index 
		names.remove("Michel");		//removing object
		names.removeFirst();
		names.removeLast();
		
		System.out.println(names);
		
		//4. Traverse
		names.add("Peter");
		names.add("Thomas");
		names.add("Emili");
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for(String str : names) {
			System.out.println(str);
		}
		System.out.println();
		int i=0;
		while(i < names.size()) {
			System.out.println(names.get(i));
			i++;
		}
		System.out.println();
		Iterator itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//5. size of list
		System.out.println("LinkedList has: "+names.size()+" elements");
		
		//6. set and get
		names.set(0, "Adam");
		names.set(1,"Mark");
		
		System.out.println("\n LinkedList: "+names);
		
		System.out.println("at index 2: "+names.get(2));
		System.out.println("at first: "+names.getFirst());
		System.out.println("at last: "+names.getLast());
		
		//7. clear the list
		names.clear();
		System.out.println("\n After clearing the list: "+names);
	}

}
