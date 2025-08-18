 package JavaCodePractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonRepeating {
public static void main(String[] args) {
		
	String str="AABBCCDEZE";
	
	HashMap <Character, Integer> hm=new HashMap<Character, Integer>();
	for(int i=0; i<str.length(); i++)
	{
		char word=str.charAt(i);
		if(hm.containsKey(word))
		{
			hm.put(word, hm.get(word)+1);
		}
		else 
		{
            hm.put(word, 1); 
        }
	}
	for(Entry<Character, Integer> entry:hm.entrySet())
	{
		if(entry.getValue()==1)
		{
		System.out.println("Non Repated Character is :"+entry.getKey());
		}
	}	
	
	
	}

}
