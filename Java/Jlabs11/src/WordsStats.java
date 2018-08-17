
public class WordsStats 
{
	public static String mySplit(String fullSentence) 
	{
		String nextWord;
		int spPos;
		spPos = fullSentence.indexOf(" ");
		nextWord = fullSentence.substring(0, spPos);
		return nextWord;
	}
	public static String myNewSentence(String fullSentence) 
	{
		int spPos;
		spPos = fullSentence.indexOf(" ");
		fullSentence = fullSentence.substring(spPos +1, fullSentence.length());
		return fullSentence;
	}
	public static boolean realWord(String word)
	{
		boolean real;
		real = false;
		int counter;
		counter = 0;
		for (int i = 0; i <= word.length()-1; i++)
		{
			if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'))
			{
				counter++;
			}
			if (counter == word.length())
			{
				real = true;
			}
		}
		return real;
	}
	public static int myVowels(String word) 
	{
		int vowels;
		vowels = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e') 
			{
				vowels++;
			}
			if (word.charAt(i) == 'i' || word.charAt(i) == 'o') 
			{
				vowels++;
			}
			if (word.charAt(i) == 'u' || word.charAt(i) == 'A') 
			{
				vowels++;
			}
			if (word.charAt(i) == 'E' || word.charAt(i) == 'I') 
			{
				vowels++;
			}
			if (word.charAt(i) == 'O' || word.charAt(i) == 'U') 
			{
				vowels++;
			}
		}
	System.out.println(word + " = vowels " + vowels);
	return vowels;
	}
	public static int myConsonant(String word) 
	{
		int consonant;
		consonant = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			if ((word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') && (word.charAt(i) != 'A' && word.charAt(i) != 'E' && word.charAt(i) != 'I' && word.charAt(i) != 'O' && word.charAt(i) != 'U'))
			{
				consonant++;
			}
		}
		System.out.println(word + " = consonants " + consonant);
		return consonant;
	}
}
