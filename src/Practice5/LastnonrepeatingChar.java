package Practice5;

public class LastnonrepeatingChar {
public static void main(String[] args) {
		
	String s="ababccddeffggii";
	String output="";
	for(int i=s.length()-1; i>=0; i--)
	{
		char ch=s.charAt(i);
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			System.out.println("Last Non Repeat Char found :"+ch);
			break;
		}
	}
	}

}
