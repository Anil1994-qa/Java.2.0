package Practice2;

public class RemoveDupinString {
public static void main(String[] args) {
		
	String s="anilnavya";
	String output="";
	for(int i=0; i<=s.length()-1; i++)
	{
	    char ch=s.charAt(i);
	    if(output.indexOf(ch)==-1)
	    {
	    	output=output+ch;
	    }
	}
	System.out.println("Original String :"+s);
	System.out.println("After removing duplicates from String :"+output);

	}

}
