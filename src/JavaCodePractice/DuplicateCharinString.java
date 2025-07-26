package JavaCodePractice;

import java.util.HashMap;

public class DuplicateCharinString {
    public static void main(String[] args) {
        
        String str = "Java automation with Selenium";
        char[] ch = str.toCharArray();
        
        HashMap<Character, Integer> hs = new HashMap<>();
        
        // Count frequency of each character
        for (int i = 0; i < ch.length; i++) {
            if (hs.containsKey(ch[i])) {
                hs.put(ch[i], hs.get(ch[i]) + 1);
            } else {
                hs.put(ch[i], 1);
            }
        }

        // Print only characters that occur more than once, ignoring spaces
        System.out.println("Duplicate characters are:");
        for (Character key : hs.keySet()) {
            if (hs.get(key) > 1 && key != ' ') {
                System.out.println(key + " : " + hs.get(key));
            }
        }
    }
}
