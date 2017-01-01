/**
 * @author Savan Patel
 * 
 */
// this program will compare two words to see if the second word exists
// in the first word, if so then print out true and if not than print out false
public class myMain { 
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Case 1: " + find("mississippi","sip"));
		System.out.println("Case 2: " + find("mississippi","api"));
	}
	
	/**
	 * Recursive method for looking for a substring in a string
	 * @param text
	 * this is the main word that will be checked with, the substring will be looked inside this word
	 * @param str
	 * this word is the substring that will be compared with the first word if substring is in first word
	 * @return true if str is a substring of text
	 */
	public static boolean find(String text, String str)
	{
		//converting both the substring and the string to lowercase because capital letters dont make the word different
		text = text.toLowerCase();
		str = str.toLowerCase();
		
		//checking if the either words are null, if so then its automatically false because program cant run then
		if (text == null || str == null)
		{
			return false;
		}
		
		//checking if the substring is greater then the length of the acutal word because substring is suppose
		// to be smaller than acutal word or else substring is no more substring
		if (str.length()>text.length())
		{
			return false;
		}
		
		//checking if the length of the words are same and if so then check if the words are actually not the
		//same and if so then return true if words are entierly same, so substring is equal to the word
		if (text.length() == str.length())
		{
			return text.equals(str);
		}
		
		//checking if the substring is in the start of the word if so return true else false
		// or if the substring is somewhere in the word after the first letter to the end of letter in the word;
		//than return true else false
		return text.startsWith(str) || find(text.substring(1),str);
	}

}
