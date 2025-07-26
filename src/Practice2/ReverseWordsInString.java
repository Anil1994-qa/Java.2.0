package Practice2;

public class ReverseWordsInString {
public static void main(String[] args) {
		
    String input = "Bangalore is the capital city of Karnataka";
          String word[]= input.split(" ");
          for(int i=word.length-1; i>=0; i--)
          {
        	  System.out.print(word[i]);
              System.out.print(" ");
          }

	}

}
