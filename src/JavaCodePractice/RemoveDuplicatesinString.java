/*
  output is a string that holds unique characters seen so far.

  ch is the current character in the loop from input.toCharArray().

   output.indexOf(ch) checks if that character is already in the output.
 */
package JavaCodePractice;

public class RemoveDuplicatesinString {
public static void main(String[] args) {

	String input="Anil is a bigg failure and not able to switch to automation:(";
	String output="";
	for(char ch:input.toCharArray())
	{
		if(output.indexOf(ch)==-1)
		{
			output=output+ch;
		}
	}
	System.out.println(input);
	System.out.println(output);

	}

}
