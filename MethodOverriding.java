/* 	Method overrding = Runtime Polymorphism
	Data member overriding is not possible
*/
class A{
	int value = 10;
	void display() {
		System.out.println("A diplay");
	}
	void run() {
		System.out.println("A is running");
	}
}
class B extends A{
	int value = 20;
	void display(){
		System.out.println("B display");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		A obj = new B();
		obj.display();
		System.out.println(obj.value);
//		obj.run();
	}

}
