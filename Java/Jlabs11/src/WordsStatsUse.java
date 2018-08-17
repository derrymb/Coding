
public class WordsStatsUse 
{

	public static void main(String[] args) 
	{
		String sentence;
		String[] sentenceWords = new String[50];
		for (int i = 0; i < sentenceWords.length; i++)
		{
			sentenceWords[i] = "";
		}
		String firstWord;
		int noOfWords;
		int index;
		String mostVowels;
		String mostConsonants;
		String smallest;
		mostVowels = "";
		mostConsonants = "";
		smallest = "";
		int small;
		int vowels;
		int consonants;
		vowels = 1;
		small = 99999;
		consonants = 1;
		noOfWords = 0;
		index = 0;
		System.out.println("Please enter a sentence to be analyazed!");
		sentence = EasyIn.getString();
		int spaceIndex;
		sentence +=  " ";
		spaceIndex = sentence.indexOf(" ");
		while (spaceIndex > 0)
		{
			firstWord = WordsStats.mySplit(sentence);
			//System.out.println(firstWord);
			sentence = WordsStats.myNewSentence(sentence);
			//System.out.println(WordsStats.realWord(firstWord));
			if (WordsStats.realWord(firstWord) == true)
			{
				noOfWords++;
				sentenceWords[index] = firstWord;
				index++;
			}
			spaceIndex = sentence.indexOf(" ");
			
		}
		for (int i  = 0; i < noOfWords; i++)
		{
			if (i == 0)
			{
				vowels = WordsStats.myVowels(sentenceWords[i]);
				consonants = WordsStats.myConsonant(sentenceWords[i]);
				mostVowels = sentenceWords[i];
				mostConsonants = sentenceWords[i];
			}
			if (WordsStats.myVowels(sentenceWords[i]) >= vowels)
			{
				vowels = WordsStats.myVowels(sentenceWords[i]);
				mostVowels = sentenceWords[i];
				System.out.println("vowel change engaged to " + mostVowels);
			}
			if (WordsStats.myConsonant(sentenceWords[i]) >= consonants)
			{
				consonants = WordsStats.myConsonant(sentenceWords[i]);
				mostConsonants = sentenceWords[i];
				System.out.println("consonant change engaged" + mostConsonants);
			}
			
		}
		for (int i  = 0; i < noOfWords; i++)
		{
			if (WordsStats.myVowels(sentenceWords[i]) == WordsStats.myConsonant(sentenceWords[i]) && sentenceWords[i].length() <= small )
			{
				smallest = sentenceWords[i];
				small = sentenceWords[i].length();
			}
		}
		System.out.println("\tSentence Statistics:");
		System.out.println("\tThe number of real words in your sentence are " + noOfWords);
		System.out.print("\t");
		for (int i  = 0; i < noOfWords; i++)
		{
			System.out.print(sentenceWords[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("\tThe word with the largest number of vowels\t" + mostVowels + " with " + vowels);
		System.out.println("\tThe word with the largest number of consonants\t" + mostConsonants + " with " + consonants);
		System.out.println("\tThe shortest word with an equal no of vowels and consonants\t" + smallest);
	}
}
