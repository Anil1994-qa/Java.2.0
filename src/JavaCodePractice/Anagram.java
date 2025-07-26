package JavaCodePractice;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
// Strings are made from similar characters or same words
	
	String s="mary"; 
	String s1="army"; //stop, tops
		
	//Convert the given string to array
	char[] arr=s.toLowerCase().toCharArray();
	char [] arr1=s1.toLowerCase().toCharArray();
	Arrays.sort(arr);
	Arrays.sort(arr1);
	System.out.println(arr);
	System.out.println(arr1);

	
	if(Arrays.equals(arr, arr1))
	{
		System.out.println("Given Strings are anagram");
	}
	else
	{
		System.out.println("Given Strings are not anagram");
	}
	
	}

}
