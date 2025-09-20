package Practice3;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumOccuranceinArray {
public static void main(String[] args) {
		
	int a[]= {2,3,4,3,4,2,4,5,3,4,3,3,2,4,1,2,1,2,4,5};
	HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
	
	for(int i=0; i<a.length; i++)
	{
		if(hm.containsKey(a[i]))
		{
			hm.put(a[i], hm.get(a[i])+1);
		}
		else
		{
			hm.put(a[i], 1);
		}
	}

	   for(Entry<Integer, Integer> num:hm.entrySet())
	   {
		   System.out.println("The number :"+num.getKey()+" Occured -"+num.getValue()+" times");
	   }
	}

}
