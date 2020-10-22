/*
 * 1. Operations possible with Wrapper class: Integer.
 * 2. There are approx 34 methods to play with in this class.
 * 3. Some useful methods are shown below
 * 
 * int = 4 bytes
 * Integer = 16 bytes
 * 
 */


public class WrapperClass {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer s = new Integer("20");
		
		//1. convert Integer to int
		int n = s.intValue();	//byteValue() floatValue() doubleValue() shortValue() longValue()
		System.out.println(n);
				
		//2. convert Integer to String
		String str = i.toString();
		System.out.println(str);
		
		//3. compare two if numbers are equal 0,1,-1
		System.out.println( Integer.compare(2,4) );
		System.out.println(Integer.compare(i, 4) );
		System.out.println(i.compareTo(4));
		
		//4. check if two objects or object with primitive datatype are equal
		System.out.println(i.equals(s));
		int a1 = 10;
		int a2 = 20;
		if( a1 == a2 )	//== is used to check if primitive datatypes are equal
			System.out.println("two int are equal");
		else
			System.out.println("two int are not equal");
		
		//5. toInteger()
		
		//6. Math operations: max min sum 
		System.out.println( Math.max(i, s) );
		System.out.println( Math.min(i, 5));
		System.out.println( Math.sqrt(81));
		System.out.println(Integer.sum(23, 17) );
		
		//7. convert compatible String to int
		int x = Integer.parseInt("34");
		System.out.println(x);
		
		//8. convert int to String
		int y = 15;
		String str3 = Integer.toString(15);
		System.out.println(str3.getClass());
	}

}
