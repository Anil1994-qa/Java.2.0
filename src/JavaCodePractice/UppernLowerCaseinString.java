package JavaCodePractice;

public class UppernLowerCaseinString {
public static void main(String[] args) {
	
	String str="Anil Kumar N Is An Employee In IndiuM SoftWare";
	
	int upper =0;
	int lower =0;
	
	for(int i=0; i<=str.length()-1; i++)
	{
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
			upper++;
		}
		else if(Character.isLowerCase(ch))
		{
			lower++;
		}
	}
	System.out.println("Total Upper case in given String :"+upper);
	System.out.println("Total lower case in given String :"+lower);
	
	}

}
