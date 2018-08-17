
public class WordsStatsUse 
{

	public static void main(String[] args) 
	{
		String sentence;
		String[] sentenceWords;
		sentenceWords = new String[50];
		String firstWord;
		
		int index;
		index = 0;
		System.out.println("Please enter a sentence to be analyazed!");
		sentence = EasyIn.getString();
		int spaceIndex;
		spaceIndex = sentence.indexOf(" ");
		sentence += " ";
		while (spaceIndex >= 0)
		{
			firstWord = WordsStats.mySplit(sentence);
			sentence = WordsStats.myNewSentence(sentence);
			spaceIndex = sentence.indexOf(" ");
			sentenceWords[index] = firstWord;
			System.out.println(sentence);
			System.out.println(firstWord);
			index++;
		}
		/*firstWord = WordsStats.mySplit(sentence);
		sentence = WordsStats.myNewSentence(sentence);
		System.out.println(sentence);
		System.out.println(firstWord);*/
	}
}
