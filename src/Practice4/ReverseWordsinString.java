package Practice4;

public class ReverseWordsinString {
public static void main(String[] args) {
		
	String s="Bangalore is capital city of karnataka";
	String words[]=s.split(" ");
	for(int i=words.length-1; i>=0; i--)
	{
		System.out.print(words[i]);
		System.out.print(" ");
	}
	}

}
