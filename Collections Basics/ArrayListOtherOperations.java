/*
 * sort, compare, join two ArrayList, listIterator, trim size, conversion form other collections,	 
 */
import java.util.*;
public class ArrayListOtherOperations {

	public static void main(String[] args) {
		ArrayList<Integer> alObj = new ArrayList<>();
		
		alObj.add(40);
		alObj.add(20);
		alObj.add(20);
		alObj.add(10);
		alObj.add(50);
		
		//1. sort
		System.out.println("alObj before sorting: "+alObj);
		Collections.sort(alObj);
		System.out.println("alObj after sorting: "+alObj);
		
		
		/*2. compare two ArrayLists
		 *
		 * 2.1 equals(): 	check if ArrayList objects are equal
		 * 2.2 removeAll(): 
		 * 2.3 retainAll():
		 * 2.4 contains():
		 */
		
		//2.1 equals() check if two ArrayList have same object in same order
		ArrayList<Integer> alObj4 = new ArrayList<>();
		
		alObj4.add(50);
		alObj4.add(20);
		alObj4.add(20);
		alObj4.add(10);
		alObj4.add(40);
		
		System.out.println("\nArrayList1: "+alObj+" ArrayList2: "+alObj4);
		System.out.println("ArrayList1 equals ArrayList2 ?: "+alObj.equals(alObj4));
		
		Collections.sort(alObj);
		Collections.sort(alObj4);
		System.out.println("after sorting, ArrayList1 equals ArrayList2 ?: "+alObj.equals(alObj4));
		
		//2.2 removeAll() removes all elements in AL1 which are present in Al2
//		alObj.removeAll(alObj4);
		System.out.println("After removing all matching elements from ArrayList2 "+alObj);
		
		//2.3 retainAll() is opposite of removeAll(), this retains what is common in both lists
//		alObj.retainAll(alObj4);
		System.out.println("common elemens in both the list are: "+alObj);
		
		//2.4 contains() is same as equals() except here the order dosent matter
		System.out.println("alObj contains alObj4? "+alObj.containsAll(alObj4));
		
		//2.5
		
		
		
		//3. Join twoArrayList
		ArrayList<Integer> alObj2 = new ArrayList<>();
		alObj2.add(100);
		alObj2.add(400);
		alObj2.add(200);
		alObj2.add(600);
		
		alObj.addAll(alObj2); 	//adds alObj2 at the end of alObj
		System.out.println("\n after adding alObj2 at the end of alObj: "+alObj+"\n");
		
		//4. ListIterator: can be used to iterate on both the direction
		
		ListIterator<Integer> li = alObj.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//5. trimToSize: trims the capacity to the lists current size
		ArrayList<Integer> alObj3 = new ArrayList<>(50);
		alObj3.add(20);
		alObj3.add(150);
		alObj3.add(209);
		alObj3.add(60);
		alObj3.add(110);
		
		alObj3.trimToSize();
		
		//6. Convert other Collections to ArrayList
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Harry");
	    linkedlist.add("Jack");
	    linkedlist.add("Tim");
	    linkedlist.add("Rick");
	    linkedlist.add("Rock");
	    
	    List<String> list = new ArrayList<String>(linkedlist);
	    for (String str : list){
	        System.out.println(str);
	      }
	    
	     HashSet<String> hset = new HashSet<String>();
	     
	     //add elements to HashSet
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	    
	     List<String> list2 = new ArrayList<String>(hset);
	     
	     
	     /*
	      * https://www.geeksforgeeks.org/how-to-convert-hashmap-to-arraylist-in-java/
	      */
	     
	     
	     
	     
	}

}
