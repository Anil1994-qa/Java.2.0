package JavaCodePractice;

public class ExtractNumFromString {
public static void main(String[] args) {
		
	String s="Anil143Navya";
	String s1="";
	
	s1=s.replaceAll("[^0-9]", "");
	System.out.println(s1);
	
	}

}
