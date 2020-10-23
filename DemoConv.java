/*
 * Converting data as shown in DataConversion table
 */
class intToOthers {
	void convert(int i) {
		System.out.println("convertng int to others");
		
		float f = i; System.out.println("to float "+f);
		double d = i; System.out.println("to double "+d);
		
		String str = String.valueOf(i);	System.out.println("to String "+str); //if string is null does not throw exception
//		String str2 = Integer.toString(i); System.out.println("to String "+str2); also works
		
		Integer obj = new Integer(i); System.out.println("to Integer "+obj);
		Float obj2 = new Float(i); System.out.println("to Float "+obj2);
		Double obj3 = new Double(i); System.out.println("to Double "+obj3);		
	}
}
class floatToOthers {
	void convert(float f) {
		System.out.println("convertng float to others");
	
		int i = (int)f; System.out.println("to int "+f);
		double d = f; System.out.println("to double "+d);
		
		String str = String.valueOf(f);	System.out.println("to String "+str);
//		String str2 = Float.toString(f); System.out.println("to String "+str2); also works
		
		Integer obj = new Integer((int) f); System.out.println("to Integer "+obj);
		Float obj2 = new Float(f); System.out.println("to Float "+obj2);
		Double obj3 = new Double(f); System.out.println("to Double "+obj3);		
	}
}
class doubleToOthers {
	void convert(double d) {
		System.out.println("convertng double to others");
	
		int i = (int)d; System.out.println("to int "+i);
		float f = (float)d; System.out.println("to float "+f);
		String str = String.valueOf(d);	System.out.println("to String "+str);
//		String str2 = Double.toString(i); System.out.println("to String "+str2); also works
		
		Integer obj = new Integer((int) d); System.out.println("to Integer "+obj);
		Float obj2 = new Float((int) d); System.out.println("to Float "+obj);
		Double obj3 = new Double(d); System.out.println("to Double "+obj3);
	}
}

class StringToOthers {
	void convert(String str) {
		System.out.println("convertng String to others");
		
		int i = Integer.parseInt(str); System.out.println("to int "+i);
		float f = Float.parseFloat(str); System.out.println("to float "+f);
		double d= Double.parseDouble(str); System.out.println("to double "+d);
		
		Integer obj = Integer.valueOf(str); System.out.println("to Integer "+obj);
		Float obj2 = Float.valueOf(str); System.out.println("to Float "+obj2);
		Double obj3 = Double.valueOf(str); System.out.println("to Double "+obj3);
	}
}

class  IntegerToOthers {
	void convert(Integer in) {
		System.out.println("convertng Integer to others");
		
		int i = in.intValue(); System.out.println("to int "+i);
		float f = in.floatValue(); System.out.println("to float "+f);
		double d = in.doubleValue(); System.out.println("to double "+d);
		
		String str = String.valueOf(in); System.out.println("to String "+str);
		String str2 = Integer.toString(in); System.out.println("to String "+str);
		
		//Wrapper to other Wrapper classes is not possible, but we can workaround
		Float obj = (float)in;	System.out.println("to Float "+obj);
		Double obj2 = (double)in; System.out.println("to Double "+obj2);
	}
}




public class DemoConv {

	public static void main(String[] args) {
		Integer in = new Integer(51);
		
		intToOthers obj1 = new intToOthers();	obj1.convert(10);
		System.out.println();
		floatToOthers obj2 = new floatToOthers();	obj2.convert(20.f);
		System.out.println();
		doubleToOthers obj3 = new doubleToOthers();	obj3.convert(36.18);
		System.out.println();
		StringToOthers obj4 = new StringToOthers(); obj4.convert("41");
		System.out.println();
		IntegerToOthers obj5 = new IntegerToOthers(); obj5.convert(in);
	}
}

