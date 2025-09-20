package Practice5;

public class CapitalCharinString {
public static void main(String[] args) {
		
	String s="AbcDeFgHiJ";
	int upper=0;
	int lower=0;
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isUpperCase(s.charAt(i)))
		{
			upper++;
		}
		if(Character.isLowerCase(s.charAt(i)))
		{
			lower++;
		}
	}
	System.out.println("Total upper cases :"+upper);
	System.out.println("Total lower cases :"+lower);


	}

}
