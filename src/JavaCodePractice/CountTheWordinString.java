package JavaCodePractice;

import java.util.HashMap;
import java.util.Set;

public class CountTheWordinString {
public static void main(String[] args) {
		
	String s = "Anil navya Anil Anil";
	
	HashMap<String, Integer> wordcount=new HashMap<String, Integer>();
	
	String words[]=	s.toLowerCase().split(" ");
     for(String word:words)
     {
    	 if(wordcount.containsKey(word))
    	 {
    		 wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
    	 }
    	 else
    	 {
    		 wordcount.put(word, 1);
    	 }
     }
     
     Set <String> wordstring=wordcount.keySet();
     for(String word:wordstring)
     {
    	 if(wordcount.get(word)>1)
    	 {
    		 System.out.println(word +" : "+wordcount.get(word));
    	 }
     }
	}

}
