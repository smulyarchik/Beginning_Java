public class LetterCheck{
	public static void main(String[] args){
		char symbol='A';
		symbol=(char)(128.0*Math.random()); // Generate a random character.
		
		if(symbol>='A'){	// Is it 'A" or greater?
			if(symbol <= 'Z'){	// Yes. And is it 'Z' or less?
				// Then it is a capital letter.
				System.out.println("You have the capital letter, " + symbol);
			}else{	//If it not 'Z' or less?
				if(symbol>='a'){	//So is it 'a' or greater?
					if(symbol <= 'z'){	//Yes. Is it 'z' or less?
						// Then it is a small letter.
						System.out.println("You have a small letter, " + symbol);
					}else{	// It's not less then 'z'.
						System.out.println("The code is greater than 'a', but it's not a letter.");
					}
				}else{
					System.out.println("The code is less than 'a' but it's not a letter.");
				}
			}
		}else{
			System.out.println("The code is less than 'A' so it's not a letter.");
		}
	}
}