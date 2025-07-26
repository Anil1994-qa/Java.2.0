package JavaCodePractice;

import java.util.HashMap;

public class character_Occurrence_in_String {
public static void main(String[] args) {
	
	String str="Javaaaaaaaaaaavvvvvvvvvvvvvaaaaaa";
	HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
	    hs.put(ch, hs.getOrDefault(ch, 0) + 1);
	}
	
	for(HashMap.Entry<Character, Integer> entry:hs.entrySet())
    {
 	       System.out.println(entry.getKey()+" : "+entry.getValue());
		
    }
		}

}
