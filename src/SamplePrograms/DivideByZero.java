package SamplePrograms;

public class DivideByZero {

	public static void main(String[] args) {
		
		//System.out.println(9/0);      // arithmatic exception
		
		//System.out.println(0/0);        // arithmatic exception
		
		System.out.println(12.3f/0);      // Infinity
		
		System.out.println(19.9999d/0);    // Infinity
		
		System.out.println(0.0/0);         // NaN
		
		System.out.println(0.0/0.0);       // NaN

	}

}
