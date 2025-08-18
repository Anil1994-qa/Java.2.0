package Practice;

public class CountwordinString {
public static void main(String[] args) {
	
	String s="Capital city of India is Bengaluru";
	String word[]=s.split(" ");
	int words_count=0;
	for(String words:word)
	{
		words_count++;
	}
	
     System.out.println("Total words in given String :"+words_count);

	}

}
