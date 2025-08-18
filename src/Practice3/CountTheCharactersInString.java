package Practice3;

public class CountTheCharactersInString {
public static void main(String[] args) {

	String s="Anil Kumar";
	String s1=s.trim();
	int count=0;
	for(int i=0; i<=s1.length()-1; i++)
	{
		char ch=s1.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			count++;
		}
	}
	System.out.println("The Number of Characters in a String are :"+ count);
	}

}
