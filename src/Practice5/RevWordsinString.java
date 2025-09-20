package Practice5;

public class RevWordsinString {
public static void main(String[] args) {
		
	String s="Bangalore is the capital city of Karnataka";
	String words[]=s.split(" ");
	for(int i=words.length-1; i>=0; i--)
	{
		 System.out.print(words[i]);
		 System.out.print(" ");
	}

}

}