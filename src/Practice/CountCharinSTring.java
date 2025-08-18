package Practice;

public class CountCharinSTring {
public static void main(String[] args) {
	
	String s="HelloWorld";
	int total=0;
    for(int i=0; i<=s.length()-1; i++)
    {
    	char ch=s.charAt(i);
    	if(Character.isAlphabetic(ch))
    	{
    		total++;
    	}
    }
    System.out.println("Total characters in given String :"+total);

	}

}
