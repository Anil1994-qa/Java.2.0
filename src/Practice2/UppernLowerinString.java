package Practice2;

public class UppernLowerinString {
public static void main(String[] args) {
		
	String str="AnilKumar N";
	int upper=0;
	int lower =0;
	
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
			upper++;
		}
		if(Character.isLowerCase(ch))
		{
			lower++;
		}
	}
       

    
	 System.out.println("Total number of Upper case in Given String : "+upper);
     System.out.println("Total number of Lower case in Given String : "+lower);
	}

}
