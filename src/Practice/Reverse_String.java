package Practice;

public class Reverse_String {
public static void main(String[] args) {
		
	String a="Anil";
	String rev="";
	for(int i=a.length()-1; i>=0; i--)
	{
		char ch=a.charAt(i);
		 rev=rev+ch;
	}
     System.out.println("Reverse String is :"+rev);
	}

}
