package Practice;

import java.util.HashMap;

public class character_Occurrence_in_String {
public static void main(String[] args) {
		
	String s="anil Kumar N and Navyashree R";
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	for(char ch:s.toCharArray())
	{
		if(Character.isLetter(ch))
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
	}
	 for(HashMap.Entry<Character, Integer> entry:map.entrySet())
     {
		 if(entry.getValue()>1)
		 {
  	        System.out.println(entry.getKey()+" : "+entry.getValue());
		 }
     }
	}

}
