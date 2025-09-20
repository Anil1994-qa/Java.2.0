package Practice4;

public class LastnonRepeatingChar {
public static void main(String[] args) {

	String s="pccbmnnkmss";
	for(int i=s.length()-1; i>=0; i--)
	{
		char ch=s.charAt(i);
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			System.out.println(ch);
			break;
		}
	}
	}

}
