package Practice;

public class vowels {
public static void main(String[] args) {
		
	String a="agewrasiossdu";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

     for(int i=0; i<=a.length()-1; i++)
     {
    	 char ch=a.toLowerCase().charAt(i);
    	 if (ch >= 'a' && ch <= 'z') 
    	 {
            {
    		 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
             vowels++;
    	    }
          }
    
	}
     System.out.println("Vowels: " + vowels);

}  

}
