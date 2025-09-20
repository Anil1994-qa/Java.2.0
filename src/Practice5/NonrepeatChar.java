package Practice5;

public class NonrepeatChar {
public static void main(String[] args) {
	
	String s="aandbdbchhdff";
	String output="";
	for(int i=0; i<s.length()-1; i++)
	{
		char ch=s.charAt(i);
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			output=output+ch;
		}
	}

	System.out.println("Non Char found:"+ output);

	}

}
