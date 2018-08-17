
public class WordsStats 
{
	public static String mySplit(String fullSentence) 
	{
		String nextWord;
		int spPos;
		spPos = fullSentence.indexOf(" ");
		nextWord = fullSentence.substring(0, spPos);
		fullSentence = fullSentence.substring(spPos, fullSentence.length());
		return nextWord;
	}
	public static String myNewSentence(String fullSentence) 
	{
		int spPos;
		spPos = fullSentence.indexOf(" ");
		fullSentence = fullSentence.substring(spPos +1, fullSentence.length());
		return fullSentence;
	}
}
