/*
 * ArrayList = AL
 * 1. AL is grows dynamically
 * 2. AL do not store primitive data-types, it converts them to Objects int --> Integer
 * 3. AL do not have actual objects, it stores references of objects
 * 4. AL is always single dimensional 
 */
import java.util.*;
public class ArryListBasicOperations {

	public static void main(String[] args) {
		
		//1. create ArrayList
		ArrayList<Integer> arrList = new ArrayList<>();
		
		//2. Add elements 
		arrList.add(10);
		arrList.add(1, 20);
		arrList.add(1,30);		//pushes other elements forward
		arrList.set(0, 0);		//changes the element in that position
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		arrList.add(70);
		
		//3. Remove elements
		arrList.remove(0);	//index
//		arrList.remove(30);	//can remove object if the object is not Integer, else conflicts with above method
		
		/* 
		 * 4 Traversing : 4 ways
		 * 1. for loop
		 * 2. for each loop
		 * 3. While loop
		 * 4. Iterator
		 */
		System.out.println(arrList);
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();
		for(Integer i : arrList) {
			System.out.println(i);
		}
		System.out.println();
		int i = 0;
		while(i < arrList.size()) {
			System.out.println(arrList.get(i));
			i++;
		}
		System.out.println();
		Iterator iter = arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//5. size of ArrayList
		System.out.println("size "+arrList.size());		//not length i.e id does not start from 0

		//6. check if collection contains certain object
		System.out.println("does ArrayList has 60: "+arrList.contains(60));
		
		//7. clear entire ArrayList
		arrList.clear();
		System.out.println("after clearing: "+arrList);
	}
}
