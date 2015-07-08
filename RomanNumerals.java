import java.util.Scanner;

public class RomanNumerals {

    public static String arabicToRoman(int arabic) {
        RomanNumeral romanNumeral = RomanNumeral.findHighestRomanFor(arabic);
        return romanNumeral.name() + arabicToRoman(arabic - romanNumeral.intValue());
    }

    
    public static void main (String[] args) {
    	int number = 1;
    	while (number != -1) {
    		Scanner console = new Scanner(System.in);
			System.out.print("Enter an integer (-1 to quit):");
			try {
				number = console.nextInt();
			} catch (Exception e) { 
				System.out.println("That was an invalid input.");
				continue;
			}
			if (number == -1) {
				System.out.println("Goodbye");
				System.exit(1);
			} else if(number <= 0 || number > 3999) { 
				System.out.println("The Romans did not have a way to represent negative numbers, zero, and number larger than 3999.");
			} else {
				System.out.println(arabicToRoman(number));
				number = 1;
			}
    	}
		
    }
}
//
//Enter an integer (-1 to quit):14
//XIV
//Enter an integer (-1 to quit):92
//XCII
//Enter an integer (-1 to quit):83
//LXXXIII
//Enter an integer (-1 to quit):23
//XXIII
//Enter an integer (-1 to quit):-10
//The Romans did not have a way to represent negative numbers, zero, and number larger than 3999.
//Enter an integer (-1 to quit):0
//The Romans did not have a way to represent negative numbers, zero, and number larger than 3999.
//Enter an integer (-1 to quit):3
//III
//Enter an integer (-1 to quit):5101
//The Romans did not have a way to represent negative numbers, zero, and number larger than 3999.
//Enter an integer (-1 to quit):oops this is a mistake
//That was an invalid input.
//Enter an integer (-1 to quit):good catch
//That was an invalid input.
//Enter an integer (-1 to quit):-1
//Goodbye
