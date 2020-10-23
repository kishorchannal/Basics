/*
 * primitive type: int, float, double, boolean
 * wrapper class: Integer, Float, Double, Boolean 
 */

//taking float as example
class PrimitiveToOthers {
	
	void convert(float f) {

		int i = (int)f;		//explicit type casting | narrowing		
		double d = f;		//implicit type casting | widening
		
		String str = String.valueOf(f);		//primitives dont have object.toString
		
		Integer in = (int)f;
		Float fl = f;
		Double dl = (double)f;
	}
}
//taking Integer as example
class WrapperToOthers {
	
	void convert(Float fl) {
		
		int i = fl.intValue();	//narrowing dosen't work
		float f = fl;
		double d = fl;
		
		String str = fl.toString();
		
//		Integer in = (int)fl;	//narrowing dosen't work
		Double dl = (double)fl;
	}
}

class StringConversion{
	
	void convert(String str) {
		
		//taking int as example
		int i = Integer.parseInt(str);	//returns primitive
		//or
		int j = Integer.valueOf(str);	//returns object
		
		//taking Integer as example
		Integer in  = Integer.parseInt(str);
		Integer in2 = Integer.valueOf(str);
	}
}
public class DataConversion {

	public static void main(String[] args) {
		
		float f = 14.3f;
		Float fl = 21f;
		String str = "36";
				
		PrimitiveToOthers obj = new PrimitiveToOthers();
		WrapperToOthers obj2 = new WrapperToOthers();
		StringConversion obj3 = new StringConversion();
		
		obj.convert(f);
		obj2.convert(fl);
		obj3.convert(str);
	}
}
