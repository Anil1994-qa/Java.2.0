package Practice3;

public class NonRepeatChar {
public static void main(String[] args) {
		
	String s="AnilKumarNNavyashreeR";
	String output="";
	for(int i=0; i<s.length(); i++)
	{
		char ch=s.charAt(i);
		if(output.indexOf(ch)==-1)
		{
			output=output+ch;
		}
	}
    System.out.println("Non-repeating characters: " + output);

	
	
	}

}
