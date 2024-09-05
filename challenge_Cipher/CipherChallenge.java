/**
 * 
 */
package challenge_Cipher;

import java.util.Arrays;

/**
 * 
 */
public class CipherChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2D array of strings with hidden message
		String message[][] = { { "Buzz", "LightYear" ,"was"},
		{"once", "apon", "a"}, { "time","probably" ,"the "},
		{ "coolest", "character", "in", "Toy", "Story 2"},
		{ "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},
		{ "toy.", "i"},{ "was", "never", "keen" },
		{ "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
		{ "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"}
		};
		
		char[] lastLetters = convert2DArraytoCharArrayLastLetters(message);
		
		// Used for testing 
		
		//System.out.println(Arrays.toString(lastLetters));
		
		String hiddenMessage = convertCharArrayToUpperCaseString(lastLetters);
		
		System.out.println(hiddenMessage);			
		
	}

	/**
	 * This method converts a char array to an uppercase string.
	 * @param lastLetters - char array of last characters of each row
	 * @return - return the hidden message converted to upper case
	 */
	public static String convertCharArrayToUpperCaseString(char[] lastLetters) {
		String hiddenMessage = "";
		
		for (int i = 0 ; i < lastLetters.length; i++) {
			hiddenMessage += lastLetters[i];
		}

		hiddenMessage = hiddenMessage.toUpperCase();
		return hiddenMessage;
	}

	/**
	 * This method extracts the last character of the last word of each row
	 * 
	 * @param message - 2D array of strings
	 * @return - Char array of last characters of each row
	 */
	public static char[] convert2DArraytoCharArrayLastLetters(String[][] message) {
		
		char [] lastLetters = new char [message.length];
		
		String word = "";
		
		for (int i = 0; i < message.length; i++) {
			for (int j = message[i].length - 1; j < message[i].length; j++) {
				word = message[i][j];
				lastLetters[i] = word.charAt(word.length() - 1);
			}
		}
		return lastLetters;
	}

}
