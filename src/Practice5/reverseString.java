package Practice5;

public class reverseString {
public static void main(String[] args) {	
	
	String s="Automation java";
	String rev="";
	for(int i=s.length()-1;i>=0; i--)
	{
		char ch =s.charAt(i);
		rev=rev+ch;
	}
	System.out.println("Reverse string :"+rev);

	}

}
