import java.io.IOException;

public class AverageFruit{
	public static void main(String[] args){
		double numOranges = 50.0E-1;
		double numApples = 1.0E1;
		double averageFruit = 0.0;
		System.out.println("A totally fruity program");
		System.out.println("Num oranges: " + numOranges);
		System.out.println("Num apples: " + numApples);
		//averageFruit = (numOranges + numApples) / 2.0;
		averageFruit = (numOranges - 5.0) / (numApples - 10.0);
		System.out.println("Average fruit is " + averageFruit);
		
		System.out.println("(Press Enter to exit)");
		try{
			System.in.read();
		}catch(IOException e){
			return;
		}
	}
}