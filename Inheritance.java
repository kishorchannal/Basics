class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrek(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	public String information() {
		return ("Bicycle gears:"+gear+" Bicycle speed:"+speed);
	}
}

class MountainBike extends Bicycle {
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	public void changeSeatHeight(int newValue) {
		this.seatHeight = newValue; 
	}
	public String information() {
		return (super.information()+" seatHeight:"+seatHeight);
	}
}



public class Inheritance {

	public static void main(String[] args) {
//		Bicycle bicycleObject = new Bicycle(4,100); 
//		System.out.println(bicycleObject.information());
		MountainBike mountainBikeObject = new MountainBike(3, 200, 25);
		System.out.println(mountainBikeObject.information());
		mountainBikeObject.applyBrek(40);
		System.out.println(mountainBikeObject.information());
		
	}

}
