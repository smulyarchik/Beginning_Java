public class Ex2{
	public static void main(String[] args){
		// Initialize a double variable with some value such as 1234.5678.
		double value = 1234.5678;
		// Retrieve the integral part of the value and store it in a variable of type long.
		long intPart = (long)Math.floor(value);
		// Retrieve the first four digits of the fractional part and store them in an integer of type short.
		short fracPart =  (short)((value - intPart) * Math.pow(10, 4));
		// Display the value of the double variable by outputting the two values stored as integers.
		System.out.println("Value is: " + (int)intPart + "." + (int)fracPart);
	}
}