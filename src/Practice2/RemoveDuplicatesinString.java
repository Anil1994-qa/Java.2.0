package Practice2;

public class RemoveDuplicatesinString {
public static void main(String[] args) {
		
	String s="Anilnavya";
	String output="";
	for(char word:s.toCharArray())
	 {
		if(output.indexOf(word)==-1)
		{
			output=output+word+" ";   //output.indexOf(word) checks if that character exists anywhere in output.If it returns -1, it means:

                                         // This character has not appeared in output yet.
		}
	 }
        System.out.println("Original String : "+s);
        System.out.println("After removing duplicates :"+output);

	}

}
