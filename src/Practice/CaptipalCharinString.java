package Practice;

public class CaptipalCharinString {
public static void main(String[] args) {
		
	String s="HelloWorld";
	int upper=0;
	for(int i=0; i<s.length(); i++)
	{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			upper++;
		}
	}
     System.out.println("Upper case characters in given String :"+upper);
	}

}
