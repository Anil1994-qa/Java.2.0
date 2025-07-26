package Practice2;

import java.util.HashMap;
import java.util.Map;

public class WordcountinString {
public static void main(String[] args) {
		
	String s="java automation java selenium java selenium";
	HashMap<String, Integer>hm=new HashMap<String, Integer>();
	String word[]=s.split(" ");
    for(String words:word)
    {
    	if(hm.containsKey(words))
    	{
    		hm.put(words, hm.get(words)+1);
    	}
    	else
    	{
    		hm.put(words, 1);
    	}
    }
    for(Map.Entry<String, Integer>entry:hm.entrySet())
    {
    	if(entry.getValue()>1)
    	{
    		System.out.println("Word "+entry.getKey()+" Occured :"+entry.getValue()+ " times");
    	}
    }
	}

}
