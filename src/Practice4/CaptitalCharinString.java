package Practice4;

public class CaptitalCharinString {
public static void main(String[] args) {

	String s="AnIl KuMAr N";
	String upper=" ";
	String lower="";
	for(int i=0; i<s.length()-1; i++)
	{
		if(Character.isUpperCase(s.charAt(i)))
		{
			upper=upper+s.charAt(i);
		}
		if(Character.isLowerCase(s.charAt(i)))
		{
			lower=lower+s.charAt(i);
		}
	}
	System.out.println("Upper cases in Given string :"+upper);
	System.out.println("Lower cases in Given string : "+lower);

	}

}
