package Practice2;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonRepeatinginString {
public static void main(String[] args) {
		
	String s="aabbccgllkk";
	HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
	for(char ch:s.toCharArray())
	{
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
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
