package Practice4;

public class CharcountinString {
public static void main(String[] args) {
		
	String s="aabbbccccddddd";
	String output="";
	int count=0;
	for(int i=0; i<s.length()-1; i++)
	{
		if(s.charAt(i) == s.charAt(i + 1))
		{
			count++;
		}
		else
		{
			  output = output + s.charAt(i) + count;
              count = 1;
		}
	}
	output = output +s.charAt(s.length()-1)+ count;
    System.out.println(output);

	}

}
