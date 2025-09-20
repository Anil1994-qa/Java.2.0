package Practice3;

public class NonRepeatChar {
public static void main(String[] args) {
		
	String s="Aeemmnnh";
	for(int i=0; i<s.length(); i++)
	{
		char ch=s.charAt(i);
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
		    System.out.println("Non-repeating characters: " + ch);
		}
	}

	
	
	}

}
