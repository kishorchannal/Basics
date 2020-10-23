/*
 * 1. Protected		:within class only
 * 2. Default		:within package only 
 * 3. Protected		:outside package through subclass only
 * 4. Public		:everywhere
 */
import Add.Add;

class Prv {
	private int age = 50;
	float height = 6.2f;
	private void showAge() {
		System.out.println("age: "+age);
	}
	void showHeight() {
		System.out.println("height: "+height);
	} 		
}


public class AccessModifiers {
	public static void main(String[] args) {
		Prv obj1 = new Prv();
//		obj1.age;
//		obj1.showAge();
		obj1.showHeight();						//default, therefore accessible
		System.out.println(obj1.height);		//default, therefore accessible
		
		Add aObj = new Add();
		aObj.add(10, 20);						//public, therefore accessible from outside package
		
	}
}

