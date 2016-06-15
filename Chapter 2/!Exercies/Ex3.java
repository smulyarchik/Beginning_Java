public class Ex3{
	public static void main(String[] args){
		// Initialize a floating-point variable with a dollar value for your income
		float income = 30000.570F;
		// and a second floating-point variable with a value corresponding to a tax rate of 35%.
		float taxRate = 0.35F;
		// Output the amount of tax you must pay with dollars and cents stored as separate integer values.
		float taxAmount = income * taxRate; 
		int taxDollars = (int)Math.floor(taxAmount);
		final int centsInDollar = 100;
		int taxCents = (int)((taxAmount - taxDollars) * centsInDollar);
		System.out.println("Income is: " + taxDollars + " dollars and " + taxCents + " cents.");
	}
}