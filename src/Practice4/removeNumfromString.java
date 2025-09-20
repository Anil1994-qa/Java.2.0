package Practice4;

public class removeNumfromString {
public static void main(String[] args) {
		
	String s="Anil143navya";
     String s1=s.replaceAll("[0-9]","");
     System.out.println("String after removing numbers :"+s1);
	}

}
   