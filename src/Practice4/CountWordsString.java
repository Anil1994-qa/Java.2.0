package Practice4;

public class CountWordsString {
public static void main(String[] args) {

	String s="Capital city of India is Bengaluru" ;
	String [] words=s.split(" ");
	int count = 0;
	for(int i=0; i<words.length; i++)
	{
		
		if(s.contains(words[i]))
		{
			count++;
		}
	}
	System.out.println("The total words in given String :"+count);
	}

}
