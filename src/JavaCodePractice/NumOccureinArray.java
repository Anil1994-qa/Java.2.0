package JavaCodePractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumOccureinArray {
public static void main(String[] args) {
		
	int a[]= {2,3,2,4,5,5,2,8};
    
	HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
	for(int number:a)
	{
		if(hm.containsKey(number))
		{
			hm.put(number, hm.getOrDefault(number, 0) + 1);;
		}
		else
		{
			hm.put(number, 1);
		}
	}
	for(Entry<Integer, Integer> entry:hm.entrySet())
	{
		System.out.println(entry.getKey() +":"+ entry.getValue());
	}
	}

}
