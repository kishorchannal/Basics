/* Abstraction is achieved by
 * 1. Abstract class
 * 2. Interface
 */


abstract class Bike {
	abstract void run();
	void show() {
		System.out.println("showing bike");
	}
}

class Honda extends Bike {
	//override of abstract method is compulsory
	void run() {
		System.out.println("Honda is running");
	}
}

public class Abstraction {

	public static void main(String[] args) {
//		Bike obj1 = new Bike(); 		cannot instantiated abstract class
		Honda obj = new Honda();
		obj.run();
		obj.show();
	}

}
