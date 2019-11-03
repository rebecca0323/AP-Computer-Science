//Made by Rebecca Zhu on 10/19/19
// purpose is to make the methods static

package chapter5;

import java.util.Scanner;

public class PigLatinTranslator {
	
	//static method that helps translate words into pig latin
	public static String translate(String sentence) {
		String result = "";
		
		sentence = sentence.toLowerCase();
		Scanner scan = new Scanner(sentence);
		while(scan.hasNext()) {
			result += translateWord (scan.next());
		}
		return result;
	}
	
	// helper method to translate a word, translate each word into pig latin. if the word begins with 
	// vowel, the suffix "yay" is appended to the word. Otherwise, the first letter or two are moved to the end of the word, and "ay"
	// is appended
	private static String translateWord(String word) {
		String result = "";
		
		if(beginsWithVowel(word))
			result = word + "yay";
		else
			if(beginsWithBlend(word))
				result = word.substring(2) + word.substring(0, 2) + "ay";
			else
				result = word.substring(1) + word.charAt(0) + "ay";
		
		return result;
	}
	
	//determines if the specified word begins with a vowel
	private static boolean beginsWithVowel (String word) {
		String vowels = "aeiou";
		char letter = word.charAt(0);
		return (vowels.indexOf(letter) != -1);
	}
	
	//determines if the specified word begins with a particular two character consonant blend.
	private static boolean beginsWithBlend(String word) {
		return( word.startsWith("bl") || word.startsWith("sc") ||
				word.startsWith("br") || word.startsWith("sh") ||
				word.startsWith("ch") || word.startsWith("sk") ||
				word.startsWith("cl") || word.startsWith("sl") ||
				word.startsWith("cr") || word.startsWith("sn") ||
				word.startsWith("dr") || word.startsWith("sm") ||
				word.startsWith("dw") || word.startsWith("sp") ||
				word.startsWith("fl") || word.startsWith("sq") ||
				word.startsWith("fr") || word.startsWith("st") ||
				word.startsWith("gl") || word.startsWith("sw") ||
				word.startsWith("gr") || word.startsWith("th") ||
				word.startsWith("kl") || word.startsWith("tr") ||
				word.startsWith("ph") || word.startsWith("tw") ||
				word.startsWith("pl") || word.startsWith("wh") ||
				word.startsWith("pr") || word.startsWith("wr"));
				
	}
	
}
