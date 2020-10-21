/*
 * Interface provides 100% abstraction
 * All methods inside interface are by default abstract
 * Every method of interface should be overridden  
 */
interface MyInterface {
	public void method1();
	public void method2();
}

interface Inf1{
	    public void method1();
}

interface Inf2 extends Inf1 {
	   public void method2();
}

class Demo implements MyInterface {
	//override of all methods compulsory 
	
	 public void method1() {
		System.out.println("method1 from Demo");
	}
	
	public void method2() {
		System.out.println("method2 from Demo");
	}
}

class Demo2 implements Inf2 {
	public void method1() {
		System.out.println("child class");
	}
	public void method2() {
		method1();
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.method1();
		obj.method2();
		
		System.out.println();
		
		Demo2 obj2 = new Demo2();
		obj2.method1();
		obj2.method2();
		
	}
}
