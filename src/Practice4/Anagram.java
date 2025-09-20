package Practice4;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
		
	String x="rat";
	String y="tar";
	
	char[] s=x.toCharArray();
	char[] s1=y.toCharArray();
	Arrays.sort(s);
	Arrays.sort(s1);
   if(Arrays.equals(s, s1))
   {
	   System.out.println("Given strings are anagram");
   }
   else
   {
	   System.out.println("Given strings are not anagram");
   }
	}

}
