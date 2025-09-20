package Practice4;

public class Palindrome {
public static void main(String[] args) {

	String s="amma";
	String rev="";
	for(int i=s.length()-1; i>=0; i--)
	{
		char ch=s.charAt(i);
		 rev=rev+ch;
	}
	if(s.toLowerCase().equals(rev))
	{
		System.out.println("Given String is Palindrome :" + rev);
	}
	else
	{
		System.out.println("Given String is not Palindrome :" + rev);
	}
	
	}

}
