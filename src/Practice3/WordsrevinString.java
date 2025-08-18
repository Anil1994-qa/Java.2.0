package Practice3;

public class WordsrevinString {
public static void main(String[] args) {
		
	String s="Welcome to java Automation";
	String word[]=s.split(" ");
	for(int i=word.length-1; i>=0; i--)
	{
		System.out.print(word[i]);
		System.out.print(" ");
	}

	}

}
