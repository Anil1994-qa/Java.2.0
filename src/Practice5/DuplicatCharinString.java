package Practice5;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatCharinString {
public static void main(String[] args) {
		
	String s="HelloWorld";
	HashMap<Character, Integer>hm= new HashMap<Character, Integer>();
	for(int i=0; i<s.length(); i++)
	{
		char ch=s.charAt(i);
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
    	if(entry.getValue()>1)
    	{
     	   System.out.println("The Char "+entry.getKey()+" Occures -"+entry.getValue() +" times");

    	}
    }

	}

}
