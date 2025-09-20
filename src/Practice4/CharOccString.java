package Practice4;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharOccString {
public static void main(String[] args) {
		
	String a="ansbddhjdnsbsjsmdndbdbdndjdnsbshsj";
	HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
	for(int i=0; i<=a.length()-1; i++)
	{
		char ch=a.charAt(i);
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
		System.out.println("The Character : "+entry.getKey()+" Occured -"+entry.getValue()+" Times");
	}

	}

}
