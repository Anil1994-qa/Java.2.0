package StringBuffer_StringBuilder;

public class StringVsStringBufferVsStringBuilder {
public static void main(String[] args) {
	
	//String - Immutable
     String s="Navyashree";
     System.out.println(s);
     s.concat("Anil");
     System.out.println(s); //String is immutable we can not change the original value of s
     
     //StringBuffer -- Mutable
     StringBuffer sbr=new StringBuffer("Anil Kumar");
     System.out.println(sbr);
     sbr.append("Navyashree"); //StringBuffer - Mutable we can change the original value of sbr
     System.out.println(sbr);

     
     //StringBuffer -- Mutable
     StringBuilder sbr1=new StringBuilder("WelCome");
     System.out.println(sbr1);
     sbr1.append("to java and selenium"); //StringBuilder - Mutable we can change the original value of sbr
     System.out.println(sbr1);
     
	}

}
