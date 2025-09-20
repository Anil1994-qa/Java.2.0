package Practice5;

public class CountCharinString {
public static void main(String[] args) {
		
	String s="Anilnavya";
	int count=0;
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isAlphabetic(s.charAt(i)))
		{
			count++;
		}
	}
	System.out.println("Total count of chars :"+count);

	}

}
