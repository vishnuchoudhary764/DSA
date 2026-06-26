
import java.util.HashMap;

public class mostFrequentChar {

    static char findChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }
         char maxChar = ' ';
        int maxFreq = 0;
         for (char ch : freq.keySet()) {
            if (freq.get(ch) > maxFreq) {
                maxFreq = freq.get(ch);
                maxChar = ch;
            }
            else if (freq.get(ch)  == maxFreq && ch < maxChar) {
                maxChar = ch;
            }
        }

        return maxChar;

    }

    public static void main(String[] args) {
   String s = "bbaacc";
   System.out.println(findChar(s));
    }
}
