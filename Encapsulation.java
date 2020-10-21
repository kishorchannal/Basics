/*
 * 1. used for data hiding
 * 2. reduce data members scope to private and use setter and getters to access them
 *  
 */

class Student {
	private int rollNo;
	private String name;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Student obj = new Student();
		
		
		obj.setRollNo(10);
		obj.setName("John");
		
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());
		
		
	}
}
