package Practice4;

public class NonrepeatingChar {
public static void main(String[] args) {
		
	String s="absbsdababdefe";
	String output="";
	for(int i=0; i<s.length()-1; i++)
	{
		char ch=s.charAt(i);
		if(output.indexOf(ch)==-1)
		{
			output=output+ch;
		}
	}
	System.out.println("Non repeating char found :"+output);
	}

}
