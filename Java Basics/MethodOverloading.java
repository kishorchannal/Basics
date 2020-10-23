/*1. change number of parameters
 *2. change data-type of parameters
 *3. change sequence of data-type of parameters
 */

class Type1{
	void display() {
		System.out.println("no args");
	}
	void display(int arg1) {
		System.out.println("arg1: "+arg1);
	}
	void display(int arg1, int arg2) {
		System.out.println("arg1: "+arg1+" arg2: "+arg2);
	}
}

class Type2{
	void run(int arg1) {
		System.out.println("arg1: "+arg1);
	}
	void run(String arg1) {
		System.out.println("arg1: "+arg1);
	}
	void run(float arg1) {
		System.out.println("arg1: "+arg1);
	}
}

class Type3{
	void show(int arg1, String arg2) {
		System.out.println("arg1: "+arg1+" arg2: "+arg2);
	}
	void show(String arg1, int arg2) {
		System.out.println("arg1: "+arg1+" arg2: "+arg2);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Type1 obj1 = new Type1();
		obj1.display();
		obj1.display(10);
		obj1.display(20, 130);
		
		System.out.println();
		
		Type2 obj2 = new Type2();
		obj2.run(10);
		obj2.run("abc");
		obj2.run(14.5f);
		
		System.out.println();
		
		Type3 obj3 = new Type3();
		obj3.show(10, "abc");
		obj3.show("abc", 20);
	}

}
