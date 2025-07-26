package Practice2;

import java.util.Arrays;

public class Angram {
public static void main(String[] args) {
		
	String s="stop";
	String s1="tops";
	
	char[] s2=s.toCharArray();
	char [] s3=s1.toCharArray();
	Arrays.sort(s2);
	Arrays.sort(s3);
	System.out.println(s2);
	System.out.println(s3);

	if(Arrays.equals(s2, s3))
	{
		System.out.println("Given Strings are anagram");
	}
	else
	{
		System.out.println("Given Strings are not anagram");
	}

	}

}
